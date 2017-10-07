/*
 * MIT License
 * 
 * Copyright (c) 2017 Bruce Davidson
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
*/
import kotlinx.cinterop.*
import sdl.*

fun main(args: Array<String>) {
    val game = Game(640, 512)
    game.start()
    while (game.isRunning) {
        game.handleEvents()
        game.update()
    }
    game.destroy()
    return
}

fun get_SDL_Error() = SDL_GetError()!!.toKString()

class Game(val width: Int, val height: Int) {

    private var displayWidth: Int = 0
    private var displayHeight: Int = 0
    private val window: CPointer<SDL_Window>
    private val renderer: CPointer<SDL_Renderer>
    private val texture: CPointer<SDL_Texture>
    private val platform: String
    private val pool = Arena()
    private val rect: SDL_Rect
    private var running: Boolean = false

    val isRunning get() = running

    init {
        if (SDL_Init(SDL_INIT_EVERYTHING) != 0) {
            println("SDL_Init Error: ${get_SDL_Error()}")
            throw Error()
        }

        if (IMG_Init(IMG_INIT_PNG) != IMG_INIT_PNG) {
            println("Unable to init image")
            throw Error()
        }
        if (TTF_Init() == -1) {
            println("Unable to init truetype fonts")
            throw Error()
        }
        if (Mix_OpenAudio(MIX_DEFAULT_FREQUENCY, MIX_DEFAULT_FORMAT.toShort(), 2, 2048) == -1) {
            println("Unable to init mixer")
            throw Error()
        }

        platform = SDL_GetPlatform()!!.toKString()

        memScoped {
            val displayMode = alloc<SDL_DisplayMode>()
            if (SDL_GetCurrentDisplayMode(0, displayMode.ptr.reinterpret()) != 0) {
                println("SDL_GetCurrentDisplayMode Error: ${get_SDL_Error()}")
                SDL_Quit()
                throw Error()
            }
            displayWidth = displayMode.w
            displayHeight = displayMode.h
        }
        
        val window = SDL_CreateWindow("Shmupwarz [${platform}]", 100, 100, width, height, SDL_WINDOW_SHOWN)
        if (window == null) {
            println("SDL_CreateWindow Error: ${get_SDL_Error()}")
            SDL_Quit()
            throw Error()
        }
        this.window = window

        val renderer = SDL_CreateRenderer(window, -1, SDL_RENDERER_ACCELERATED or SDL_RENDERER_PRESENTVSYNC)
        if (renderer == null) {
            SDL_DestroyWindow(window)
            println("SDL_CreateRenderer Error: ${get_SDL_Error()}")
            SDL_Quit()
            throw Error()
        }
        this.renderer = renderer

        rect = pool.alloc<SDL_Rect>()
        rect.w = width
        rect.h = height
        rect.x = 0
        rect.y = 0

        texture = loadImage(window, renderer, "images/background.png")
    }

    private fun loadImage(win: CPointer<SDL_Window>, ren: CPointer<SDL_Renderer>, imagePath: String): CPointer<SDL_Texture> {
        val bmp = IMG_LoadPNG_RW(SDL_RWFromFile(imagePath, "rb"));
        if (bmp == null) {
            SDL_DestroyRenderer(ren)
            SDL_DestroyWindow(win)
            println("IMG_LoadPNG_RW Error: ${get_SDL_Error()}")
            SDL_Quit()
            throw Error()
        }

        val tex = SDL_CreateTextureFromSurface(ren, bmp)
        SDL_FreeSurface(bmp)
        if (tex == null) {
            SDL_DestroyRenderer(ren)
            SDL_DestroyWindow(win)
            println("SDL_CreateTextureFromSurface Error: ${get_SDL_Error()}")
            SDL_Quit()
            throw Error()
        }
        return tex
    }

    fun update() {
        SDL_RenderClear(renderer)
        SDL_RenderCopy(renderer, texture, null, rect.ptr.reinterpret())
        SDL_RenderPresent(renderer)
    }

    fun start() {
        running = true
    }

    /**
    * Handle Events
    */
    fun handleEvents() {
        memScoped {
            val event = alloc<SDL_Event>()
            while (SDL_PollEvent(event.ptr.reinterpret()) != 0) {
                val eventType = event.type
                when (eventType) {
                    SDL_QUIT -> {
                        running = false
                    }
                    // SDL_KEYDOWN -> {
                    //     val keyboardEvent = event.ptr.reinterpret<SDL_KeyboardEvent>().pointed
                    //     when (keyboardEvent.keysym.scancode) {
                    //         SDL_SCANCODE_LEFT -> commands.add(UserCommand.LEFT)
                    //         SDL_SCANCODE_RIGHT -> commands.add(UserCommand.RIGHT)
                    //         SDL_SCANCODE_DOWN -> commands.add(UserCommand.DOWN)
                    //         SDL_SCANCODE_Z, SDL_SCANCODE_SPACE -> commands.add(UserCommand.ROTATE)
                    //         SDL_SCANCODE_UP -> commands.add(UserCommand.DROP)
                    //         SDL_SCANCODE_ESCAPE -> commands.add(UserCommand.EXIT)
                    //     }
                    // }
                    // SDL_MOUSEBUTTONDOWN -> if (gamePadButtons != null) {
                    //     val mouseEvent = event.ptr.reinterpret<SDL_MouseButtonEvent>().pointed
                    //     val x = mouseEvent.x
                    //     val y = mouseEvent.y
                    //     val command = gamePadButtons.getCommandAt(x, y)
                    //     if (command != null)
                    //         commands.add(command)
                    // }
                }
            }
        }
    }


    fun destroy() {
        SDL_DestroyTexture(texture)
        SDL_DestroyRenderer(renderer)
        SDL_DestroyWindow(window)
        SDL_Quit()
    }
}


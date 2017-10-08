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
    private val platform: String
    private val pool = Arena()
    private var running: Boolean = false
    val entities: List<Entity>
    val count: Int
    val isRunning get() = running

    object mouse {
        var x = 0
        var y = 0
        var pressed = false
    }

    init {
        srand(time(null).toInt())
        
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
        entities = Entities.createLevel(renderer)
        count = entities.size
    }

    fun update() {
        SDL_RenderClear(renderer)

        for (e in entities) {
            if (e.active) {
                val rect = pool.alloc<SDL_Rect>()
                rect.w = e.sprite.width
                rect.h = e.sprite.height
                rect.x = e.position.x.toInt()
                rect.y = e.position.y.toInt()
                SDL_RenderCopy(renderer, e.sprite.texture, null, rect.ptr.reinterpret())

            }
        }
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
                    SDL_KEYDOWN -> {
                        val keyboardEvent = event.ptr.reinterpret<SDL_KeyboardEvent>().pointed
                        when (keyboardEvent.keysym.scancode) {
                            SDL_SCANCODE_ESCAPE -> running = false
                        }
                    }
                    SDL_MOUSEBUTTONUP -> {
                        mouse.pressed = false
                    }
                    SDL_MOUSEBUTTONDOWN -> {
                        val mouseEvent = event.ptr.reinterpret<SDL_MouseButtonEvent>().pointed
                        mouse.x = mouseEvent.x
                        mouse.y = mouseEvent.y
                        mouse.pressed = true
                    }
                    SDL_MOUSEMOTION -> {
                        val mouseEvent = event.ptr.reinterpret<SDL_MouseMotionEvent>().pointed
                        mouse.x = mouseEvent.x
                        mouse.y = mouseEvent.y
                        entities[count-1].position.x = mouse.x.toDouble()
                        entities[count-1].position.y = mouse.y.toDouble()
                    }
                }
            }
        }
    }


    fun destroy() {
        SDL_DestroyTexture(entities[0] .sprite.texture)
        SDL_DestroyRenderer(renderer)
        SDL_DestroyWindow(window)
        SDL_Quit()
    }
}


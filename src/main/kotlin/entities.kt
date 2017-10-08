import kotlinx.cinterop.*
import sdl.*

/**
 * Entity database record
 */
data class Entity (                    
    val id: Int,                        /* Unique sequential id */
    val name: String,                   /* Display name */
    val active: Boolean,                /* In use */
    val actor: Actor,                   /* Actor Id */
    val category: Category,             /* Category */
    val position: Point2d,              /* Position on screen */
    val bounds: Rectangle,              /* Collision bounds */
    val scale: Vector2d,                /* Display scale */
    val sprite: Sprite,                 /* Sprite */
    val sound: Effect?,                 /* Sound effect */
    val tint: Color?,                   /* Color to use as tint */
    val expires: Double?,               /* Countdown until expiration */
    val health: Health?,                /* Track health */
    val scaleTween: ScaleTween?,        /* scale Tweening variables*/
    val velocity: Vector2d?             /* Cartesian velocity*/
)

//private fun randInt() = (rand() and 32767) or ((rand() and 32767) shl 15)

/**
 * Entity factory
 */
object Entities {
    var uniqueId = 0
    fun getUniqueId():Int {
        uniqueId+= 1
        return uniqueId
    }

    fun createSprite(renderer:CPointer<SDL_Renderer>, path:String, width:Int, height:Int):Sprite  {
        val surface = IMG_Load(path)
        if (surface == null) {
            println("unable to load surface")
        }
        val sprite = Sprite(SDL_CreateTextureFromSurface(renderer, surface), width, height)
        if (sprite.texture == null) {
            println("unable to load texture")
        }
        SDL_SetTextureBlendMode(sprite.texture, SDL_BLENDMODE_BLEND)
        return sprite
    }

    fun createBackground(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/background.png"
        val width = 512
        val height = 512
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Background",
            active = true,
            actor = Actor.Background,
            category = Category.Background,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, width, height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = null,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }

    fun createPlayer(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/fighter.png"
        val width = 108
        val height = 172
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Player",
            active = true,
            actor = Actor.Player,
            category = Category.Player,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, width, height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = null,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }

    fun createBullet(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/bullet.png"
        val width = 5
        val height = 17
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Bullet",
            active = false,
            actor = Actor.Bullet,
            category = Category.Bullet,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, (width*2).toInt(), height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = 2.0,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }
    fun createEnemy1(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/enemy1.png"
        val width = 69
        val height = 91
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Enemy1",
            active = false,
            actor = Actor.Enemy1,
            category = Category.Enemy,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, width, height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = null,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }

    fun createEnemy2(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/enemy2.png"
        val width = 172
        val height = 172
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Enemy2",
            active = false,
            actor = Actor.Enemy2,
            category = Category.Enemy,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, width, height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = null,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }

    fun createEnemy3(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/enemy3.png"
        val width = 320
        val height = 320
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Enemy3",
            active = false,
            actor = Actor.Enemy3,
            category = Category.Enemy,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, width, height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = null,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }


    fun createExplosion(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/explosion.png"
        val width = 512
        val height = 512
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Explosion",
            active = false,
            actor = Actor.Explosion,
            category = Category.Explosion,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, width, height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = null,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }

    fun createBang(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/explosion.png"
        val width = 512
        val height = 512
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Explosion",
            active = false,
            actor = Actor.Bang,
            category = Category.Explosion,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, width, height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = null,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }

    fun createParticle(renderer:CPointer<SDL_Renderer>):Entity {
        val img = "images/star.png"
        val width = 32
        val height = 32
        val sprite = createSprite(renderer, img, width, height)

        return Entity(
            id = getUniqueId(),
            name = "Particle",
            active = false,
            actor = Actor.Particle,
            category = Category.Explosion,
            position = Point2d(0.0, 0.0),
            bounds = Rectangle(0, 0, width, height),
            sprite = sprite,
            sound = null,
            scale = Vector2d(1.0, 1.0),
            tint = null,
            expires = null,
            health = null,
            scaleTween = null,
            velocity = null
        )
    }

    /**
     * Recycle entities from the pool
     */
    fun bullet(e:Entity, x:Double, y:Double):Entity {
        return e.copy(
            active = true,
            position = Point2d(x, y),
            expires = 1.0, 
            sound = Effect.Pew,
            health = Health(2, 2),
            tint = Color(0xd2.toByte(), 0xfa.toByte(), 0x00.toByte(), 0xffa.toByte()),
            velocity = Vector2d(0.0, -800.0)
        )
    }
    
    
    fun enemy1(e:Entity, x:Double, y:Double):Entity {
        return e.copy(
            active = true,
            position = Point2d(x, y),
            velocity = Vector2d(0.0, 40.0),
            health = Health(10, 10)
        )
    }

    fun enemy2(e:Entity, x:Double, y:Double):Entity {
        return e.copy(
            active = true,
            position = Point2d(x, y),
            velocity = Vector2d(0.0, 30.0),
            health = Health(20, 20)
        )
    }

    fun enemy3(e:Entity, x:Double, y:Double):Entity {
        return e.copy(active = true,
            position = Point2d(x, y),
            velocity = Vector2d(0.0, 20.0),
            health = Health(60, 60)
        )
    }
    fun explosion(e:Entity, x:Double, y:Double):Entity {
        return e.copy(
            active = true,
            position = Point2d(x, y),
            scale = Vector2d(0.5, 0.5),
            sound = Effect.Asplode,
            scaleTween = ScaleTween(0.5/100, 0.5, -3.0, false, true),
            tint = Color(0xd2.toByte(), 0xfa.toByte(), 0xd2.toByte(), 0xfa.toByte()),
            expires = 0.2
        )
    }

    fun bang(e:Entity, x:Double, y:Double):Entity {
        return e.copy(
            active = true,
            position = Point2d(x, y),
            scale = Vector2d(0.2, 0.2),
            sound = Effect.SmallAsplode,
            scaleTween = ScaleTween(0.2/100, 0.2, -3.0, false, true),
            tint = Color(0xd2.toByte(), 0xfa.toByte(), 0xd2.toByte(), 0xfa.toByte()),
            expires = 0.2
        )
    }

    fun particle(e:Entity, x:Double, y:Double):Entity {
        val Tau = 6.28318
        val radians = (rand().toDouble()/1.0) * Tau
        val magnitude = rand() % 100 + 50
        val velocityX = magnitude.toDouble() * Math.cos(radians)
        val velocityY = magnitude.toDouble() * Math.sin(radians)
        val scale = (rand() % 10).toDouble() / 10.0
        return e.copy(
            active = true,
            position = Point2d(x, y),
            scale = Vector2d(scale, scale),
            velocity = Vector2d(velocityX, velocityY),
            tint = Color(0xfa.toByte(), 0xfa.toByte(), 0xd2.toByte(), 0xff.toByte()),
            expires = 0.5
        )
    }

  /**
   * Create the level database pool
   */
  fun createLevel(renderer:CPointer<SDL_Renderer>):List<Entity> {
    return arrayOf(
        createBackground(renderer),
        createEnemy1(renderer),
        createEnemy1(renderer),
        createEnemy1(renderer),
        createEnemy1(renderer),
        createEnemy2(renderer),
        createEnemy2(renderer),
        createEnemy2(renderer),
        createEnemy2(renderer),
        createEnemy3(renderer),
        createEnemy3(renderer),
        createEnemy3(renderer),
        createEnemy3(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createParticle(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBullet(renderer),
        createBang(renderer),
        createBang(renderer),
        createBang(renderer),
        createBang(renderer),
        createBang(renderer),
        createBang(renderer),
        createExplosion(renderer),
        createExplosion(renderer),
        createExplosion(renderer),
        createExplosion(renderer),
        createExplosion(renderer),
        createExplosion(renderer),
        createPlayer(renderer)
    ).toList<Entity>()
  }
    
}
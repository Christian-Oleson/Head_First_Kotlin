import java.util.*

@FunctionalInterface
interface Roamable {
    fun roam() = println("The ${this::class.simpleName!!} is roaming")
}

abstract class Animal : Roamable {
    open val image = "${this::class.simpleName!!.lowercase(Locale.getDefault())}.jpg"
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    fun eat() = println("The ${this::class.simpleName!!} is eating $food")

    override fun roam() = println("The ${this::class.simpleName!!} is roaming")

    fun sleep() = println("The ${this::class.simpleName!!} is sleeping")
}

class Hippo: Animal() {
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() = println("Grunt! Grunt!")
}

abstract class Canine: Animal()

class Wolf: Canine() {
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() = println("Hooooowl!")
}

class Vehicle : Roamable

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}
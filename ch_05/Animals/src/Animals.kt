import java.util.*

open class Animal {
    open val image = "${this::class.simpleName!!.lowercase(Locale.getDefault())}.jpg"
    open var food = ""
    open val habitat = ""

    open fun makeNoise() {
        println("The ${this::class.simpleName!!} is making a noise")
    }

    fun eat() {
        if (food.isNotBlank()) {
            food = " $food"
        }

        println("The ${this::class.simpleName!!} is eating$food")
    }

    fun roam() {
        println("The ${this::class.simpleName!!} is roaming")
    }

    fun sleep() {
        println("The ${this::class.simpleName!!} is sleeping")
    }
}

class Hippo: Animal() {
    override var food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }
}

open class Canine: Animal()

class Wolf: Canine() {
    override var food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooowl!")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main() {
    val animals = arrayOf(Hippo(), Wolf(), Canine())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val wolf = Wolf()
    val hippo = Hippo()
    val vet = Vet()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}
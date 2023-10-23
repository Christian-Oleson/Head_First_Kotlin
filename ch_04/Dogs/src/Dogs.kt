import java.util.*

class Dog(val name: String, weightParam: Int, breedParam: String) {

    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")
    private val breed = breedParam.uppercase(Locale.getDefault())

    init {
        println("The breed is $breed.")
    }

    var weight = weightParam
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main() {
    val myDog = Dog("Rizzo", 15, "Shitzu")
    myDog.bark()
    myDog.weight = 20
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight} lbs.")
    myDog.activities = arrayOf("Walks", "Petting", "Sleeping")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }

    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}
class Wolf {
    var hunger = 10
    private val food = "meat"

    fun eat() {
        println("The ${this::class.simpleName!!} is eating $food")
    }
}

class MyWolf {
    var wolf: Wolf? = Wolf()
}

fun getAlphaWolf(): Wolf {
    return Wolf()
}

fun main() {
    val w = Wolf()
    w.eat()

    val x = w.hunger
    println("The value of x is $x")

    val y = w.hunger
    println("The value of y is $y")

    val myWolf = MyWolf()
    myWolf.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf.wolf?.hunger}")

    val myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let { println(it) }
    }

    getAlphaWolf().eat()
}
fun main(){
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision", "referral")

    val rand1 = getRandomNumberFromArray(wordArray1)
    val rand2 = getRandomNumberFromArray(wordArray2)
    val rand3 = getRandomNumberFromArray(wordArray3)

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}

fun<T> getRandomNumberFromArray(array : Array<T>) : Int {
    return (Math.random() * array.size).toInt()
}
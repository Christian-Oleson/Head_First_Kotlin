class Song(private val title: String, private val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main() {
    val songOne = Song("Stairway to heaven", "Led Zeppelin")
    val songTwo = Song("Don't Think Twice, It's All Right", "Bob Dylan")
    val songThree = Song("Like the Wheel", "The Tallest Man on Earth")
    songOne.play()
    songOne.stop()
    songTwo.play()
    songTwo.stop()
    songThree.play()
    songThree.stop()
}
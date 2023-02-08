fun main() {
    println("Введите строку: ")
    val words = readLine()
    if (words != null) {
        val last = words.split(" ").filter{ it.length % 2 != 0 }.minWithOrNull(compareBy<String> { it.length })
        println(last)

    }
}
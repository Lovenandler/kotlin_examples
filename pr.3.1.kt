fun main() {
    val arr = readLine()
    if (arr != null) {
        val number = arr.toIntOrNull()
        if (number != null && number > 0) {
            val min: Int? = arr.map { it.toString().toInt()}.filter { it % 2 == 0 }.minOrNull()
            if (min != null) println(min)
            else println("null")
        }
    } else {
        println("Некорректный ввод")
    }
}


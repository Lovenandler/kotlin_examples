fun minLambda(n: Int?, condition: (Int) -> Boolean = { n: Int -> n % 2 == 0 }): Int? {
    var min = 10
    var number = n
    if (number != null && number > 0) {
        while (number != 0) {
            if (condition(number) && number % 10 < min) {
                min = number % 10
            }
            number /= 10
        }
        return if (min == 10) null
        else min
    } else {
        println("Некорректное число")
    }
    return min
}

fun main() {
    println("Введите число: ")
    val number = readLine()?.toIntOrNull()
    println(minLambda(number))
}


/*fun min2(n: Int?, con: (Int) ->Int){
    val zero = 0
    val result = arrayListOf<Int>()
    if (n != null) {
        val nums = n.toString()
        val res = nums.toCharArray()
        for (i in res) {
            val l = i.toString()
            if(con(l.toInt()) == 0){
                result.add(l.toInt())
            } else
                println("$l нечетное")
        }
        println("Четные числа: " + result.joinToString(""))
        //joinToString - слияние массива в строку
        println("Минимальное четное число: " + result.min())
        if (n < zero) {
            println("Вы ввели отрицательное число")
        }
    }
    else {
        println("Вводная строка имеет неверный формат")
    }
}
fun main() {
    try {
        println("Введите число: ")
        val number = readLine()!!.toIntOrNull()
        val condition = { x: Int -> x % 2 }
        min2(number, condition)
    }catch (e: Exception){
        println(e.message)
    }
}*/


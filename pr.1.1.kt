//Для данного неотрицательного целого числа найдите указанный результат. Осуществите проверку корректности ввода. Оформите программу и
//устраните все warning.
//6. минимальную четную цифру
//проверки, to какой-либо тип низя, делать примитивно как в паскаль, tailrec - списать с пары переделать

fun main() {
    var min = 10
    val arr = readLine()
    if (arr != null) {
        var number = arr.toIntOrNull()
        if (number != null && number > 0) {
            while (number != 0) {
                if (number % 2 == 0 && number % 10 < min) {
                    min = number % 10
                }
                number /= 10
            }
            if (min == 10) println("null")
            else println(min)
        }else println("Некорректное число")
    }
}
/*fun main() {
    try {
        println("Введите число: ")
        val number = readLine()!!.toIntOrNull()
        //!! - not null
        val zero = 0
        val result = arrayListOf<Int>()
        if (number != null) {
            val nums = number.toString()
            val res = nums.toCharArray()
            for (i in res) {
                val n = i.toString()
                if(n.toInt()%2 == 0){
                    result.add(n.toInt())
                } else
                    println("$n нечетное")
            }
            println("Четные числа: " + result.joinToString(""))
            //joinToString - слияние массива в строку
            println("Минимальное четное число: " + result.min())
            if (number < zero) {
                println("Вы ввели отрицательное число")
            }
        }
        else {
            println("Вводная строка имеет неверный формат")
        }
    }catch (e: Exception){
        println(e.message)
    }

}*/



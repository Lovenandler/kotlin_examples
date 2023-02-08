fun even(x: Int) = x % 2 == 0 //single expression function
fun min(n: Int?):Int?{
    var min = 9
    var number = n
    if (number != null && number > 0) {
        while (number != 0) {
            if(even(number) && number%10<min){
                min = number%10
            }
            number /= 10
        }
        return min
    } else {
        println("Некорректное число")
    }
    return min
}

fun main() {
    println("Введите число: ")
    val number = readLine()?.toIntOrNull()
    println(min(number))
}
/*fun minimum(n: Int?){
    val zero = 0
    val result = arrayListOf<Int>()
    if (n != null) {
        val nums = n.toString()
        val res = nums.toCharArray()
        for (i in res) {
            val l = i.toString()
            if(even(l.toInt()) == 0){
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
        minimum(number)
    }catch (e: Exception){
        println(e.message)
    }
}*/

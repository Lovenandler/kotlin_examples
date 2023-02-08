/*Измените программу, сделанную в задании No1 практической работы No1:
основной алгоритм вынесите в функцию. Опишите функцию несколькими
способами:
1. как обычную функцию;
2. как tailrec-функцию.*/
//return
fun minimum(n: Int?): Int? {
    var min = 10
        var number = n
        if (number != null && number >= 0) {
            while (number != 0) {
                if(number %2==0 && number%10<min){
                    min = number%10
                }
                number /= 10
            }
            return if (min == 10) null
            else min
        } else {
        return null
    }
    return min
}

fun main() {
        println("Введите число: ")
        val number = readLine()?.toIntOrNull()
        println(minimum(number))
}
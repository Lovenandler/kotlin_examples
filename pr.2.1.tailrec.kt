/*Измените программу, сделанную в задании No1 практической работы No1:
основной алгоритм вынесите в функцию. Опишите функцию несколькими
способами:
1. как обычную функцию;
2. как tail rec-функцию.*/

fun main() {
    println("Введите число: ")
    val number = readLine()?.toIntOrNull()
    if (number != null){
        val answer = minimum(number)
        println(answer)
    }
}

tailrec fun minimum(n: Int, min: Int = 9): Int {
    return if (n == 0) min
    else {
        if (n % 2 == 0 && n % 10 < min) minimum(n, n % 10)
        else minimum(n / 10, min)
    }
}
//while (n != 0) { if (n%2==0 && n%10<min) {min = n%10}else {println("Некорректное число")} n/=10} println(min)
/*fun min(n: Int?){
    var min = 9
    var number = n
    if (number != null && number > 0) {
        while (number != 0) {
            if(number %2==0 && number%10<min){
                min = number%10
            }
            number /= 10
        }
        println(min)
    } else {
        println("Некорректное число")
    }
}*/


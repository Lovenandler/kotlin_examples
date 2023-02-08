fun main() {
    println("Введите число: ")
    val number = readLine()?.toIntOrNull()
    if (number != null){
        val answer = minimumLambda(number)
        println(answer)
    }
}

tailrec fun minimumLambda(n: Int, min: Int = 9, conditionLambda: (Int) -> Boolean = { n: Int -> n % 2 == 0 }): Int {
    return if (n == 0) min
    else if (conditionLambda(n) && n % 10 < min) minimumLambda(n, n % 10)
    else minimumLambda(n / 10, min)
}
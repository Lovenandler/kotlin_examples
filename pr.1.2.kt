/*
В строке указано несколько неотрицательных целых чисел, разделенных пробелами (по одному пробелу между числами).
Какие цифры отсутствуют ровно в двух числах?*/
fun main() {
    val digits = IntArray(10) { 0 }
    var counter = 1
    println("Enter string")
    val enterString = readLine()
    if (enterString != null) {
        for (i in enterString) {
            if (i != ' ') {
                if (digits[i.code-48] != counter)  digits[i.code-48]++

            } else {
                counter++
            }
        }
        for (digit in digits.indices) {
            if (counter - digits[digit] == 2) {
                print(digit)
            }
        }
    } else {
        println("Incorrect enter")
    }
}
// 1 21 3 4 == 1
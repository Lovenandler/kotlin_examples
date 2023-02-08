@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

fun pair(numbers: String){
    val digits = IntArray(10) { 0 }
    var counter = 1
    for (i in numbers) {
        if (i !== ' ') {
            if (digits[i.code-48] != counter)  digits[i.toInt().toChar().code-48]++

        } else {
            counter++
        }
    }
    for (digit in digits.indices) {
        if (counter - digits[digit] == 2) {
            print(digit)
        }
    }
}
fun main(){
    pair("23 3 5")
}
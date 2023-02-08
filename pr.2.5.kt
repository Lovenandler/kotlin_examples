//Вторая практическая 5 задание

fun pair(vararg numbers: String){
    val digits = IntArray(10) { 0 }
    var counter = 1
    for (i in numbers) {
        for( char in i){
            if (char.code != 32){
                if (digits[char.code-48] != counter)
                digits[char.code-48]++
            }
            else {
                counter++
            }
        }


    }
    for (digit in digits.indices) {
        if (counter - digits[digit] == 2) {
            print(digit)
        }
    }
}
fun main(){
    pair("21 3 4 2")
}

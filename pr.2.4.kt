fun main(){
    println("Введите строку: ")
    val word = readLine()
    val condition = { c: Int -> c%2 != 0 }
    val shortest = { c: Int, s: Int -> c<s}
    if (word != null) {
        println(minimize(word, condition, shortest))
    }
}


fun minimize(words: String, condition: (Int) -> Boolean, shortest: (Int, Int)-> Boolean): Char {
    var counter = 0
    var last = -1
    var short = Int.MAX_VALUE
    var word = ""
    val letters = arrayListOf<Char>()
    for (i in words.indices) {
        if (words[i] != ' ') {
            counter++
            letters.add(words[i])
        } else {
            if (condition(counter) && shortest(counter, short)) {
                word = letters.joinToString(" ")
                short = counter - 1
                last = i - 1
            }
            counter = 0
        }
    }
    if (condition(counter) && shortest(counter, short)) {
        last = words.length-1
    }
    return words[last]



}
//fun lastCharacter(a: Array<String>, com: (ArrayList<String>) ->String, con: (String) ->Int){
//    val words = arrayListOf<String>()
//    for (w in a) {
//        if (con(w) == 0) {
//            println("Число символов в $w четное")
//        } else {
//            words.add(w)
//        }
//    }
//    val res = com(words)
//    println("$res самое короткое слово")
//    val result = res.last()
//    println("$result - последняя буква")
//}
//fun main() {
//    try {
//        println("Введите слово: ")
//        val word = readLine()!!.split(" ").toTypedArray() //возвращает типизированный массив
//        val comparison = { x: ArrayList<String> -> x.min() }
//        val condition = { x: String -> x.length % 2 }
//        lastCharacter(word, comparison, condition)
//    }catch (e: Exception){
//        println(e.message)
//    }
//
//}
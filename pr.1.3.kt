/*Найдите последний символ в первом самом коротком слове в строке
с нечетным числом символов (в строке указываются только слова,
разделенные одним или несколькими пробелами).*/

fun main() {
    println("Введите строку: ")
    val words = readLine()
    var counter = 0
    var last = -1
    var short = Int.MAX_VALUE
    if (words != null) {
        for (i in words.indices) {
            if (words[i] != ' ') {
                counter++
            } else {
                if (counter < short && counter % 2 != 0) {
                    short = counter - 1
                    last = i - 1
                }
                counter = 0
            }
        }
        if (counter < short && counter % 2 != 0) {
            last = words.length - 1
        }
        if (last != -1)
        print("Ответ: " + words[last])

    }
}

//shortcut to create instance alt+ctrl+v
//shortcut to formatirovanie coda ctrl+alt+l

/*
fun main() {
    try {
        println("Введите слово: ")
        val words = arrayListOf<String>()
        val word = readLine()!!.split(" ").toTypedArray() //возвращает типизированный массив
            for (w in word) {
                if (w.length % 2 == 0) {
                    println("Число символов в $w четное")
                } else {
                    words.add(w)
                }
            }
            val res = words.min().toString()
            val result = res.last()
            println(result)
    }catch (e: Exception){
        println(e.message)
    }

}*/

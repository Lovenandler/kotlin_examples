/*
Создайте функцию, которая по данным функциям с единственным па-
раметром типа T и результатами типа String возвращает новую функ-
цию с параметром типа T, что возвращает конкатенацию данных (ко-
личество исходных функций – любое).*/
fun <T> generic(vararg f:(T)-> String): (T)->String{
    return fun(S: T): String{
        var str = ""
        for (func in f) {
            str += func(S)
        }
        return str
    }
}
fun main() {
    val f = generic<String>({"папа"},{"мама"})
    println(f(""))
}
fun first(a: Int): Int {
    return a
}
fun second(b: Int): Int {
    return b
}
fun adding(a: Int, b: Int): Int {
    return first(a)+second(b)
}
fun main(){
    println(adding(first(5),second(4)))
}
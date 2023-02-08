fun linearInequality(
    a: Int?,
    b: Int?
): Int {
    return -b!! / a!!
}
fun main(){
    val a = readLine()?.toIntOrNull()
    val b = readLine()?.toIntOrNull()

    println(linearInequality(a,b))
}
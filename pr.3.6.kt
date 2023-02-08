/*
По простому числу определите его номер в последовательности всех
простых чисел, расположенных по возрастанию*/
fun prime(n: Int): Int? {
    val primes = generateSequence(2 to generateSequence( 3) { it + 2 }) { it
        val currSeq = it.second.iterator()
        val nextPrime = currSeq.next()
        nextPrime to currSeq.asSequence().filter { it % nextPrime != 0 }
    }.map { it. first }.take(n).run { if (contains(n)) indexOf(n) else null }
    return primes
}
fun main(){
    println(prime(11))
}


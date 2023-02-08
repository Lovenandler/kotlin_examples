/*С клавиатуры вводится информация о студентах: фамилия, имя, оцен-
ки. Выведите на экран информацию о трех худших студентах по мини-
мальному баллу. В случае, если у нескольких студентов минимальный
балл совпадает, то выведите большее число студентов (пока не будут
выведены все студенты или не будут полностью исчерпаны студенты
с тремя минимальными баллами). Вывод надо осуществлять в поряд-
ке возрастания минимального балла, а для одинаковых минимальных
баллов – в алфавитном порядке по фамилии и имени.*/
fun students(){
    val input = readLine()!!
    val students = input.split(". ")
    val stud1 = students.map { it.split(", ") }
    val stud2 = stud1.map { Pair(it[0]+" "+it[1],it[2].split(" ").map { it.toInt() }.min()) }
    val stud3 = stud2.groupBy { it.first }
    val stud4 = stud3.map { pair -> pair.value.sortedBy { it.first } }
    val stud5 = stud4.takeLast(3).asReversed()
    val stud6 = stud5.flatten()
    stud6.forEach{
        println("${it.first} ${it.second}")
    }
}

fun main(){
    students()
}




   /* val marks = readLine()?.split(" ")?.map { it.toString().toInt() }?.filter { it in mark}
    val l = listOf(student to marks)
    println(l)*/

    /*val m2 = l.groupBy { it.first }
        .mapValues {
            it.value.map { it.second }
        }*/
    /*val m = student.fold(List(0){""})
        {a, b -> (a + listOf(b)) }
    println(m)*/






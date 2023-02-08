/*Функция добавления элемента в список выбирается учащимся исходя из
значения n % 4+1
2. fun add (el: T): Bool вставляет элемент в конец списка;
Процедура удаления элемента из списка выбирается учащимся исходя
из значения n/4%4+1:
fun delete(): Bool удаляет элемент с конца списка
Процедура печати элементов списка выбирается учащимся исходя из
значения n mod 5+1:
fun print():Unit печатает все элементы
Кроме того должна быть реализована функция eraseAll, которая очи-
щает весь список.

Обратите внимание, что выбор способа хранения списка обу-
славливается эффективностью выполнения перечисленных про-
цедур и функций.

Список должен быть реализован в виде generic-класса.*/
class ListItems<T>(vararg items: T) {

    private val elements = items.toMutableList()

    fun add(element: T) = elements.add(element)

    fun print(): Unit = println(elements.toString())

    fun delete() = elements.removeAt(elements.size - 1)

    fun eraseAll() = elements.removeAll(elements)

    override fun toString() = "Список элементов(${elements.joinToString()})"
}

fun main() {
    val listItems = ListItems(7, 6, 7, 8)
    println("add(): ${listItems.add(10)}")
    println("delete(): ${listItems.delete()}")
    println("print(): ${listItems.print()}")
    println("eraseAll(): ${listItems.eraseAll()}")
}

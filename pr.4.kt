/*
Программа проверки правильности оператора case с переменной-селектором
типа char (без else), в который вложены операторы присваивания пе-
ременной строковой константы.
*/

// a := '   fasdewqr2543:&*32@@#
// a:= b

/*case otmetka of
1,2     : writeln ('кошмар!');
3: writeln('плохо'); b:="string"
4: writeln('неплохо');
5: writeln('отлично!');
else writeln('таких отметок не бывает');
end
\w = A-Z a-z 0..9 _
#34(()|()|())
'Mc Donald''s'#13#10'Vkusno i tochka'
*/
//спросить как объединить условие

fun main(){
    //val a = Regex("""case\s+([\w&&\D]\w)*\s+of\s+\w\s*:\s*[\w&&\D]\w*\s*:=\s*'\s*(.[^'])*'\s*""")
    val a = Regex("""case\s+[A-Z][a-z]*([A-Z][a-z]*)\s+:\s+\w*:\s+'.\d\w(.\d\w)';\s+\w*:\s+'\w*\s*\w*\s*\w*';\s*\w*:\s*'\w*.\w'""")
    val answer = a.matchEntire("case MarvelSummer : 1: '#13#13'; mama: 'Vkusno i tochka'; papa3: 'mcdonald's'")
    println(answer)
}

package chapter1

// 데이터 클래스
data class Person(val name: String,
                  val age: Int? = null)  // Int? < nullable default null

// 최상위 main
fun main(args: Array<String>) {
    val persons = listOf(
            Person("영희"),
            Person("민수", 25),
            Person("철수", age = 29) // 이름 붙인 파라미터
    )

    // it을 사용하면 파라미터 명을 정의하지 않아도 람다식의 유일한 인자를 사용할 수 있다.
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max-by.html
    val oldest = persons.maxByOrNull { it.age ?: 0 } // 책에는 maxBy 였으나 deprecated 여서 maxByOrNull 로 사용 -> 1.7부터는 다시 생긴듯?
    val youngest = persons.minByOrNull { it.age ?: 0 } // 책에는 maxBy 였으나 deprecated 여서 maxByOrNull 로 사용 -> 1.7부터는 다시 생긴듯?
    println("나이가 가장 적은 사람 : $youngest")
    println("나이가 가장 많은 사람 : $oldest")
}

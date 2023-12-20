package chapter5

class Chapter5 {

    fun flatTest() {
        val list = listOf(
            listOf(1, 2, 3),
            listOf(3, 4, 5),
            listOf(5, 6, 7)
        )

        val flatten = list.flatten()

        println(flatten)

        val books = listOf(
            Book("Thursday Next", listOf("Jasper")),
            Book("Mort", listOf("Terry")),
            Book("Good Omens", listOf("Terry", "Nell"))
        )

        val author = books.flatMap { it.authors }.toSet() // [Jasper, Terry, Nell]

        println(author)
    }
}
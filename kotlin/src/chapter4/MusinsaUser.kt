package chapter4

class MusinsaUser : User {

    override val email: String
        get() = email
}

data class Client(val name: String, val postalCode: Int)

class Test {
    fun copyTest() {
        val client = Client("name", 111)
        client.copy()
    }

    fun user() {
        MusinsaUser().email
        MusinsaUser().nickname
    }
}
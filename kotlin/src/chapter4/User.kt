package chapter4

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@') // 뒷받침하는 필드 없이 매번 결과를 계산해 돌려준다.
}
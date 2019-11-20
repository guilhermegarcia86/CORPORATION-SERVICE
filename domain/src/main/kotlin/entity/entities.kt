package entity

import java.util.*

data class Corporation(
        val id: String,
        val name: String,
        val document: String,
        val contact: String
) {
    lateinit var email: String
    var active: Boolean = false
    lateinit var phone: String
    lateinit var createAt: Date
    lateinit var updateAt: Date
}


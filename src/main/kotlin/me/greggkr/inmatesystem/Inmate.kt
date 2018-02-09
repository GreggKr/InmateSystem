package me.greggkr.inmatesystem

class Inmate(private val number: Long, private val firstName: String, private val lastName: String, private val jailed: Boolean) {
    override fun toString(): String {
        return "Inmate[num=$number, name=${"$firstName $lastName"}, inJail=$jailed]"
    }

    enum class SecurityLevel(private val level: Int) {
        MIN(0),
        MAX(3);

        fun getLevel(): Int {
            return level
        }

        fun compare(other: SecurityLevel): Boolean {
            return level > other.level
        }
    }
}

class InmateBuilder {
    private var number: Long = Long.MIN_VALUE
    private var firstName: String = ""
    private var lastName: String = ""
    private var jailed: Boolean = false

    fun setNumber(number: Long): InmateBuilder {
        this.number = number
        return this
    }

    fun setFirstName(firstName: String): InmateBuilder {
        this.firstName = firstName
        return this
    }

    fun setLastName(lastName: String): InmateBuilder {
        this.lastName = lastName
        return this
    }

    fun setJailed(jailed: Boolean): InmateBuilder {
        this.jailed = jailed
        return this
    }

    fun build(): Inmate {
        return Inmate(number, firstName, lastName, jailed)
    }
}
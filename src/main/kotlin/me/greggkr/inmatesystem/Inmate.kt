package me.greggkr.inmatesystem

class Inmate(private val number: Long, private val firstName: String, private val lastName: String, private val prison: Prison? = null) {
    override fun toString(): String {
        return "Inmate[num=$number, name=${"$firstName $lastName"}, inJail=${prison != null}, prison=$prison]"
    }

    enum class SecurityLevel(val level: Int) {
        MIN(0),
        MAX(3);
    }

    class Builder {
        private var number: Long = Long.MIN_VALUE
        private var firstName: String = ""
        private var lastName: String = ""
        private var prison: Prison? = null

        fun setNumber(number: Long): Builder {
            this.number = number
            return this
        }

        fun setFirstName(firstName: String): Builder {
            this.firstName = firstName
            return this
        }

        fun setLastName(lastName: String): Builder {
            this.lastName = lastName
            return this
        }

        fun setPrison(prison: Prison): Builder {
            this.prison = prison
            return this
        }

        fun build(): Inmate {
            return Inmate(number, firstName, lastName, prison)
        }
    }
}
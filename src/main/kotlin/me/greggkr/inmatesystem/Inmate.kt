package me.greggkr.inmatesystem

import java.util.*

// TODO: convert country into an enum?
class Inmate(private val number: Long, private val firstName: String, private val lastName: String, private val country: String, private val crimes: List<Crime>, private val prison: Prison? = null) {
    override fun toString(): String {
        return "Inmate[num=$number, name=${"$firstName $lastName"}, country=$country, inJail=${prison != null}, crimes=$crimes, prison=$prison]"
    }

    fun getTimeInPrison(): Long {
        var time: Long = 0

        crimes.forEach { time += it.time }

        return time
    }

    enum class SecurityLevel(val level: Int) {
        MIN(0),
        MAX(3);
    }

    class Builder {
        private var number: Long = Long.MIN_VALUE
        private var firstName: String = ""
        private var lastName: String = ""
        private var country: String = ""
        private var crimes: List<Crime> = ArrayList()
        private var prison: Prison? = null

        fun setNumber(number: Long) = also { this.number = number }

        fun setFirstName(firstName: String) = also { this.firstName = firstName }

        fun setLastName(lastName: String) = also { this.lastName = lastName }

        fun setCountry(country: String) = also { this.country = country }

        fun setPrison(prison: Prison) = also { this.prison = prison }

        fun setCrimes(vararg crimes: Crime) = also { this.crimes = crimes.toList() }

        fun build(): Inmate {
            return Inmate(number, firstName, lastName, country, crimes, prison)
        }
    }
}
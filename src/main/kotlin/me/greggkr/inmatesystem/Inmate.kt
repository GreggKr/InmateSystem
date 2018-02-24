package me.greggkr.inmatesystem

// TODO: convert country into an enum?
data class Inmate(private val number: Long,
                  private val firstName: String,
                  private val lastName: String,
                  private val country: String,
                  private val crimes: List<Crime> = ArrayList(),
                  private val prison: Prison? = null) {

    fun getTimeInPrison(): Long = crimes.map { it.time }.sum()

    enum class SecurityLevel(val level: Int) {
        MIN(0),
        MAX(3)
    }
}
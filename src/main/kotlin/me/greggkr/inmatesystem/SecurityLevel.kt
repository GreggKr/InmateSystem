package me.greggkr.inmatesystem

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
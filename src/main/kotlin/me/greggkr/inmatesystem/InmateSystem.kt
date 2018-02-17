package me.greggkr.inmatesystem

fun Array<String>.main() {
    val inmate: Inmate = Inmate.Builder()
            .setNumber(1)
            .setFirstName("test")
            .setLastName("testi")
            .build()

    println(inmate)
}

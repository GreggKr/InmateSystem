package me.greggkr.inmatesystem

fun Array<String>.main() {
    val inmate: Inmate = InmateBuilder()
            .setNumber(1)
            .setFirstName("test")
            .setLastName("testi")
            .build()

    println(inmate)
}

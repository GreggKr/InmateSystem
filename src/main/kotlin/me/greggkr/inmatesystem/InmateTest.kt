package me.greggkr.inmatesystem

fun Array<String>.main() {
    val inmate: Inmate = Inmate.Builder()
            .setCountry("woah")
            .setFirstName("w")
            .setLastName("qq")
            .setNumber(1)
            .setPrison(Prison("o"))
            .build()
    println(inmate)
}
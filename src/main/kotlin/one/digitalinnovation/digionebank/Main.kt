package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.model.Bank
import one.digitalinnovation.digionebank.model.Person

fun main() {
    val jj = Person();

    println(jj.info())

    val bank = Bank(number = 12, name = "DigiOne")

    println(bank.info())

    val bank2 = bank.copy(name = "name2")

    println(bank2.info())

}
package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.enums.ClientType
import one.digitalinnovation.digionebank.model.Bank
import one.digitalinnovation.digionebank.model.Person

fun main() {

    // Criação de Pessoa
    val jj = Person();
    println(jj.info())

    // Criação de Banco
    val bank = Bank(number = 12, name = "DigiOne")
    println(bank.info())

    // Clone com Alteração
    val bank2 = bank.copy(name = "name2")
    println(bank2.info())

    // Criação de Enumeradores
    ClientType.values().forEach { type ->
        println(type.info())
    }

}
package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.enums.ClientType
import one.digitalinnovation.digionebank.model.Analyst
import one.digitalinnovation.digionebank.model.Bank
import one.digitalinnovation.digionebank.model.Client
import one.digitalinnovation.digionebank.model.Manager
import one.digitalinnovation.digionebank.util.PrintUtil

fun main() {
    specializationEmployees()
    clients()
}

fun banks() {
    PrintUtil.printSeparator("Bancos")

    // Criação de Banco
    val bank = Bank(number = 12, name = "DigiOne")
    println(bank.toString())

    // Clone com Alteração
    val bank2 = bank.copy(name = "name2")
    println(bank2.toString())
}

fun enums() {
    PrintUtil.printSeparator("Enumeradores")

    // Criação de Enumeradores
    ClientType.values().forEach { type ->
        println(type.toString())
    }
}

fun specializationEmployees() {
    PrintUtil.printSeparator("Especialização de Funcionarios")

    // Criação de Classes Abstratas
    val joao = Analyst("João Pedro", "123.123.123-12", 2000.0)
    PrintUtil.printEmployee(joao)

    val roberto = Manager("Roberto Dias", "321.321.321-32", 5000.0, "1234")
    PrintUtil.printEmployee(roberto)
}

fun clients() {
    PrintUtil.printSeparator("Clientes")

    val jose = Client("José da Silva","132.132.132-13", ClientType.PF, "1234")
    println(jose.toString())

    val mariaDoces = Client("Maria Doces","22.472.506/0001-36", ClientType.PJ, "123")
    println(mariaDoces.toString())
}
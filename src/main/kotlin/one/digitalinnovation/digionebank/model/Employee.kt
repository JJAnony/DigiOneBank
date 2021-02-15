package one.digitalinnovation.digionebank.model

import java.math.BigDecimal

abstract class Employee(
    name: String,
    cpf: String,
    val salary: Double
) : Person(name, cpf) {

    abstract fun calculateAid(): Double

    override fun toString(): String  = "Nome: $name, CPF: $cpf, Salario: $salary, Auxilio: ${calculateAid()}"

}
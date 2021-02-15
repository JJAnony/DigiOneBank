package one.digitalinnovation.digionebank.model

import one.digitalinnovation.digionebank.interfaces.Logable

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Employee(name, cpf, salary), Logable {

    override fun calculateAid() = salary * 0.2
    override fun login(): Boolean = password.equals("123")

    override fun toString(): String =
        "Nome: $name, CPF: $cpf, Salario: $salary, Auxilio: ${calculateAid()}, Logado: ${login()}"
}
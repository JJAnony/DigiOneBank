package one.digitalinnovation.digionebank.model

import one.digitalinnovation.digionebank.enums.ClientType
import one.digitalinnovation.digionebank.interfaces.Logable

class Client(
    name: String,
    cpf: String,
    val type: ClientType,
    val password: String
) : Person(name, cpf), Logable {
    override fun login(): Boolean = password.equals("1234")

    override fun toString(): String = "Nome: $name, CPF: $cpf, Type: ${type.description}, Logado: ${login()}"
}
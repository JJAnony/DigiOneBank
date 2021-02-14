package one.digitalinnovation.digionebank.model

class Person {
    var name: String = "jj"
    var cpf: String = "123.123.123.12"

    private set

    constructor()

    fun info() = "$name e $cpf"


}
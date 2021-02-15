package one.digitalinnovation.digionebank.enums

enum class ClientType(val description: String) {
    PF("Pessoa Fisica"),
    PJ("Pessoa Jurídica");

    override fun toString(): String  = "$name - $description"

}
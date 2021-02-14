package one.digitalinnovation.digionebank.model

data class Bank(val number: Int, val name: String) {

    fun info() = "$number - $name"
}

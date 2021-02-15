package one.digitalinnovation.digionebank.model

data class Bank(val number: Int, val name: String) {

    override fun toString(): String = "$number - $name"
}

package one.digitalinnovation.digionebank.model

class Manager(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary) {
    override fun calculateAid() = salary * 0.2
}
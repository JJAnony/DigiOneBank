package one.digitalinnovation.digionebank.model

import java.math.BigDecimal

class Analyst(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary) {

    open override fun calculateAid() = salary * 0.1

}
package one.digitalinnovation.digionebank.util

import one.digitalinnovation.digionebank.model.Employee

class PrintUtil {
    companion object {

        fun printSeparator(name: String) = println("------------- $name ---------------")

        fun printEmployee(employee: Employee) = println(employee.toString())
    }
}
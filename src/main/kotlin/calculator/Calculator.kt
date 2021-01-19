package calculator

import kotlin.system.exitProcess

fun main() {
    val calculator = Calculator()
    calculator.run()
}

class Calculator {

    fun addition(x: Double, y: Double): Double {
        return x + y
    }

    fun subtraction(x: Double, y: Double): Double {
        return x - y
    }

    fun multiplication(x: Double, y: Double): Double {
        return x * y
    }

    fun division(x: Double, y: Double): Double {
        return x / y
    }

    fun run() {
        var enabled = true
        while (enabled) {
            println("Welcome to console calculator")
            print("Please enter first number: ")
            val firstNumber = readLine()!!.toDouble()
            print("Please enter second number: ")
            val secondNumber = readLine()!!.toDouble()
            print("Please choose the operation: ")
            val symbol = readLine()
            var result: Double
            when (symbol) {
                "+" -> {
                    result = addition(firstNumber, secondNumber)
                    println("The result is: $result")
                }
                "-" -> {
                    result = subtraction(firstNumber, secondNumber)
                    println("The result is: $result")
                }
                "/" -> {
                    result = division(firstNumber, secondNumber)
                    println("The result is: $result")
                }
                "*" -> {
                    result = multiplication(firstNumber, secondNumber)
                    println("The result is: $result")
                }
            }
            print("Do you want to continue? ")
            print("Y/N ")
            val wantToContinue = readLine()
            if (wantToContinue.equals("N", ignoreCase = true)) {
                enabled = false
            } else if (!wantToContinue.equals("Y", ignoreCase = true)) {
                println("Wrong symbol entered. PROGRAM WILL EXIT")
                exitProcess(0)
            }
        }
    }
}

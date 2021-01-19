package calculator

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculatorTest {

    @Test
    fun `check 2 + 2 = 4`() {
        val calculator = Calculator()
        val result = calculator.addition(2.0, 2.0)
        assertEquals(4.0, result )
    }

    @Test
    fun `check 10 - 2 = 8`() {
        val calculator = Calculator()
        val result = calculator.subtraction(10.0, 2.0)
        assertEquals(8.0, result )
    }

    @Test
    fun `check 5 * 5 = 25`() {
        val calculator = Calculator()
        val result = calculator.multiplication(5.0, 5.0)
        assertEquals(25.0, result )
    }

    @Test
    fun `check 20 divided by 2 = 10`() {
        val calculator = Calculator()
        val result = calculator.division(20.0, 2.0)
        assertEquals(10.0, result )
    }
}
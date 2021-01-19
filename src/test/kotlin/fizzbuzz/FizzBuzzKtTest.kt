package fizzbuzz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FizzBuzzKtTest {

    @Test
    fun `check Multiple Of Three And Five Returns FizzBuzz`() {
        val result = fizzBuzz(15)
        assertEquals("15 - FizzBuzz", result)
    }

    @Test
    fun `check Multiple Of Three Returns Fizz`() {
        val result = fizzBuzz(3)
        assertEquals("3 - Fizz", result)
    }

    @Test
    fun `check Multiple Of Five Returns Buzz`() {
        val result = fizzBuzz(5)
        assertEquals("5 - Buzz", result)
    }

    @Test
    fun `check if not multiple of three and five returns empty string` (){
        val result = fizzBuzz(1)
        assertEquals("1", result)
    }
}
package fizzbuzz

fun main() {
    for (i in 0..20) {
        println(fizzBuzz(i))
    }
}

fun fizzBuzz(num: Int): String {
    return when {
        num % 3 == 0 && num % 5 == 0 -> "$num - FizzBuzz"
        num % 3 == 0 -> "$num - Fizz"
        num % 5 == 0 -> "$num - Buzz"
        else -> "$num"
    }
}

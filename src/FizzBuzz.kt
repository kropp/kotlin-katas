/**
 * Fizz buzz is a group word game for children to teach them about division.
 * Players take turns to count incrementally, replacing any number divisible by three
 * with the word "fizz", and any number divisible by five with the word "buzz".
 * http://en.wikipedia.org/wiki/Fizz_buzz
 *
 * Kotlin features used:
 * 1. Package level function: http://kotlinlang.org/docs/reference/functions.html
 * 2. When expression: http://kotlinlang.org/docs/reference/control-flow.html#when-expression
 */

public fun fizzBuzz(number: Int): String {
    when {
        number % 15 == 0 -> return "fizzbuzz"
        number % 5 == 0 -> return "buzz"
        number % 3 == 0 -> return "fizz"
        else -> return number.toString()
    }
}
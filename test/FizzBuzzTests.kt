import org.junit.Test as test
import kotlin.test.assertEquals

/**
 * Tests for FizzBuzz kata are pretty straightforward.
 * there are only four possible outcomes:
 * number, fizz, buzz and fizzbuzz.
 *
 * Kotlin features used:
 * 1. Import alias: http://kotlinlang.org/docs/reference/packages.html
 * 2. Assertion method from Kotlin's stdlib: http://kotlinlang.org/api/latest/jvm/stdlib/kotlin.test/
 */

public class FizzBuzzTests {
    test fun check1gives1() {
        assertEquals("1", fizzBuzz(1))
    }

    test fun check3givesFizz() {
        assertEquals("fizz", fizzBuzz(3))
    }

    test fun check5givesBuzz() {
        assertEquals("buzz", fizzBuzz(5))
    }

    test fun check15givesFizzBuzz() {
        assertEquals("fizzbuzz", fizzBuzz(15))
    }
}
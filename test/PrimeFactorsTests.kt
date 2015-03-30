import kotlin.test.assertEquals
import org.junit.Test as test

/**
 * This kata is a good example to try pure TDD approach with red-green-refactor cycle.
 * I added these tests one by one and improved the implementation step by step after each test.
 * Tip: look at the last test.
 */

public class PrimeFactorsTests {
    test fun check1givesEmptyArray() {
        assertEquals(emptyList<Int>(), primeFactors(1))
    }

    test fun check2gives2() {
        assertEquals(listOf(2), primeFactors(2))
    }

    test fun check3gives3() {
        assertEquals(listOf(3), primeFactors(3))
    }

    test fun check4gives2and2() {
        assertEquals(listOf(2, 2), primeFactors(4))
    }

    test fun check6gives2and3() {
        assertEquals(listOf(2, 3), primeFactors(6))
    }

    test fun check9gives3and3() {
        assertEquals(listOf(3, 3), primeFactors(9))
    }

    test fun check12gives2and2and3() {
        assertEquals(listOf(2, 2, 3), primeFactors(12))
    }

    test fun check90gives2and3and3and5() {
        assertEquals(listOf(2, 3, 3, 5), primeFactors(90))
    }

    test fun checkBigNumber() {
        assertEquals(listOf(3, 5, 5, 7, 11, 17), primeFactors(3*5*5*7*11*17))
    }
}
import java.lang.Math.ceil
import java.lang.Math.sqrt

/**
 * The task of this kata is to write a function that takes an integer as parameter
 * and returns list of integers, which are prime factors of given number in numerical order.
 */

public fun primeFactors(number: Int): List<Int> {
    val result = arrayListOf<Int>()

    var current = number
    var candidate = 2
    while (current > 1) {
        while (current % candidate == 0) {
            result.add(candidate)
            current /= candidate
        }
        candidate++
    }

    return result
}
package com.codewars.no_boring_zeros;

/**
 * Description
 * Numbers ending with zeros are boring.
 *
 * They might be fun in your world, but not here.
 *
 * Get rid of them. Only the ending ones.
 *
 * 1450 -> 145
 * 960000 -> 96
 * 1050 -> 105
 * -1050 -> -105
 * Zero alone is fine, don't worry about it. Poor guy anyway
 */

public class NoBoringZeros {
    public static int noBoringZeros(int n) {
        if (n == 0) {
            return n;
        }
        while (n % 10 == 0) {
            n /= 10;
        }
        return n;
    }
}

package com.codewars.mumbling;

/**
 * Description
 * This time no story, no theory. The examples below show you how to write function accum:
 *
 * Examples:
 *
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Accumul {

    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) {
                builder.append('-');
            }
            builder.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) {
                builder.append(Character.toLowerCase(c));
            }
            i++;
        }
        return builder.toString();
    }
}

package com.codewars.triangle_tester;

public class TriangleTester {
    /**
     Checks if stretches gives a triangle
     */
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }
}

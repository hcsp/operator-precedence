package com.github.hcsp.calculation;

public class Main {
    public static String concatString(String a, String b) {
        a = a == null ? "" : a;
        b = b == null ? "" : b;
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(concatString(null, null));
        System.out.println(concatString("a", null));
        System.out.println(concatString("a", "b"));
        System.out.println(concatString(null, "b"));
    }
}

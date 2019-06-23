package com.github.hcsp.calculation;

public class Main {
    public static String concatString(String a, String b) {
        String _a = a == null ? "" : a;
        String _b = b == null ? "" : b;
        return _a + _b;
    }

    public static void main(String[] args) {
        System.out.println(concatString(null, null));
        System.out.println(concatString("a", null));
        System.out.println(concatString("a", "b"));
        System.out.println(concatString(null, "b"));
    }
}

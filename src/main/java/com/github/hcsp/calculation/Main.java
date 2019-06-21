package com.github.hcsp.calculation;

public class Main {
    public static String concatString(String a, String b) {
        //return a == null ? "" : a + b == null ? "" : b;
        String bResult = b == null ? "" : b;
        return a == null ? bResult : a+bResult;
    }

    public static void main(String[] args) {
        System.out.println(concatString(null, null));
        System.out.println(concatString("a", null));
        System.out.println(concatString("a", "b"));
        System.out.println(concatString(null, "b"));
    }
}

package com.github.hcsp.calculation;

public class Main {
    // 连接两个字符串，如果字符串为空指针null，则将其当作空字符串处理
    // 现在的实现有明显的bug，请修复之。
    public static String concatString(String a, String b) {
        String temp1 = a == null ? "" : a;
        String temp2 = b == null ? "" : b;
        return temp1 + temp2;
    }

    public static void main(String[] args) {
        System.out.println(concatString(null, null));
        System.out.println(concatString("a", null));
        System.out.println(concatString("a", "b"));
        System.out.println(concatString(null, "b"));
    }
}

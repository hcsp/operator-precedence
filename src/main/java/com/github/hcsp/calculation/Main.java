package com.github.hcsp.calculation;

public class Main {
    // 连接两个字符串，如果字符串为空指针null，则将其当作空字符串处理
    // 现在的实现有明显的bug，请修复之。
    public static String concatString(String a, String b) {
        return a == null ? "": a + b == null ? "" :b==null?"":"a+b";
        //a是空值嘛，如果是，输出“”，
        // 如果a不是空值，那a+b是空值嘛，如果是，输出“”，
        // 如果a+b不是空值，应该输出的是a+b，但实际上只是输出了b
        //这里应该改正
    }

    public static void main(String[] args) {
        System.out.println(concatString(null, null));
        System.out.println(concatString("a", null));
        System.out.println(concatString("a", "b"));
        System.out.println(concatString(null, "b"));
    }
}

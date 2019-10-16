package com.github.hcsp.calculation;

public class Main {
    // 连接两个字符串，如果字符串为空指针null，则将其当作空字符串处理
    // 现在的实现有明显的bug，请修复之。
    public static String concatString(String a, String b) {
        //法一：嵌套三目运算符
        return (a == null) ? ((b == null) ? "" : "" + b) : ((b == null) ? a + "" : a + b + "");
        //法二：if条件处理异常情况
//        String stringa = a;
//        String stringb = b;
//        String s = "";
//        if (a == null) {
//            stringa = "";
//        }
//        if (b == null) {
//            stringb = "";
//        }
//        return stringa + stringb;
    }

    public static void main(String[] args) {
        System.out.println(concatString(null, null));//错
        System.out.println(concatString("a", null));//null，错
        System.out.println(concatString("a", "b"));//b，错
        System.out.println(concatString(null, "b"));//错
    }
}

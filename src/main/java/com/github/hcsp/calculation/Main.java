package com.github.hcsp.calculation;

public class Main {
    public static String concatString(String a, String b) {

        if(a==null && b == null ){
            return "";
        }else if(a==null && b!=null){
            return b;
        }else if(a!=null && b==null){
            return a;
        }else{
            return a+b;
        }
    }

    public static void main(String[] args) {
        System.out.println(concatString(null, null));
        System.out.println(concatString("a", null));
        System.out.println(concatString("a", "b"));
        System.out.println(concatString(null, "b"));
    }
}

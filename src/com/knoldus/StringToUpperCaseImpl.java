package com.knoldus;

public class StringToUpperCaseImpl {
    public static void main(String[] args) {
        StringToUpperCase<String, String, String, String, String, String, String, String>
                function = (String1, String2, String3, String4, String5, String6, String7) -> (String1 + String2 + String3 + String4 + String5 + String6 + String7)
                .toUpperCase();
        String res = function.apply("Hey ", "There ", "!!! ", "My ", "Name ", "is ", "Kuldeep ");
        System.out.println(res);
    }
}

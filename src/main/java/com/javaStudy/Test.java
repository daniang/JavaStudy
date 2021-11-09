package com.javaStudy;

public class Test {

    public static void main(String[] args) {
            String str = "str-kljjkl";
        String[] split = str.split("-");
        if (str.contains("-")){
            System.out.println(split[0]);

        }
    }
}

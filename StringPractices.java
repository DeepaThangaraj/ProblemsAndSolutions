package com.examples.concepts;

import java.util.Locale;

public class StringPractices {
    public static void main(String[] args) {
        String s1=new String("deepa is writing java programs").intern();
        String s2=new String("deepa").intern();
        String s3="deepa";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3.indexOf("pa"));
        String uppercase=s1.toUpperCase(Locale.ENGLISH);
        System.out.println(uppercase);
        String up1=s1.toUpperCase(Locale.forLanguageTag("tr"));
        System.out.println(up1);


    }
}

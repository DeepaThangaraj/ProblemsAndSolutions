package com.examples.concepts;

import java.util.ArrayList;
import java.util.List;

public class PlaindromeString {
    public static void main(String[] args) {
        String s = "awreqdfjdfg";
        char[] charArray = s.toCharArray();
        List<String> list = new ArrayList<>();
        System.out.println(s.length());
        System.out.println(charArray.length/2);
        int length=0;
        if(s.length()%2==0)
            System.out.println("cannot form palindrome from this string");
        length=charArray.length/2;
        for(int i=0;i<length;i++)
        {
            list.add(String.valueOf(charArray[i]));
        }
        for(String string:list)
        System.out.println(string);
        List<String> sortedlist=list.stream().sorted().toList();
        System.out.println("after sorting");
        for(String string:sortedlist)
            System.out.println(string);
        int j=0;
        for(int i=0;i<charArray.length;i++)
        {
            if(i<length)
            {
                charArray[i]=sortedlist.get(j).charAt(0);
                j++;
            }
            if(i==length)
                continue;
            if(i>length)
            {
                charArray[i]=sortedlist.get(j).charAt(0);
                j--;
            }

            if(j>sortedlist.size()-1)
            {
                j=sortedlist.size()-1;
            }
        }
        System.out.println(charArray);
    }
}
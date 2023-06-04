package com.examples.concepts;

import java.util.ArrayList;
import java.util.List;

public class PalindromeWithMinimumOperations {
    public static void main(String[] args)
    {
        String s="deepa";
        int length=s.length();
        for(int i=0;i<length/2;i++)
        {
            if(s.charAt(i)==s.charAt(length-i-1))
                continue;

            s=s.replace(s.charAt(length-i-1),s.charAt(i));

        }
        System.out.println(s);

        char[] c1=s.toCharArray();
        char temp;

        for(int i=0;i<c1.length/2;i++)
        {
            if(c1[i]==c1[i+1])
                continue;
            if(c1[i]>c1[i+1])
            {
              temp=c1[i];
              c1[i]=c1[i+1];
              c1[i+1]=temp;

              temp=c1[c1.length-i-1];
                c1[c1.length-i-1]=c1[c1.length-i-2];
                c1[c1.length-i-2]=temp;

            }


        }
        s=s.valueOf(c1);
        System.out.println(s);
    }
}

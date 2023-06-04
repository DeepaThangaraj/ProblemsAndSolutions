package com.examples.concepts;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {


    public static void main(String[] args) {

        String input="{{)){";
        System.out.println(validateString(input));
    }
     static boolean validateString(String s)
    {
        char[] charArray=s.toCharArray();
        int count1=0;
        int count2=0;
        int count3=0;

        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i] =='(')
            {
                count1++;
                for(int j=i+1;j<charArray.length;j++)
                {
                    if(charArray[j]==')')
                    {
                        --count1;
                         break;
                    }

                }

            }
            if(charArray[i] =='[')
            {
                count2++;
                for(int j=i+1;j<charArray.length;j++)
                {
                    if(charArray[j]==']')
                    {
                        --count2;
                        break;
                    }

                }

            }
            if(charArray[i] =='{')
            {
                count3++;
                for(int j=i+1;j<charArray.length;j++)
                {
                    if(charArray[j]=='}')
                    {
                        --count3;
                        break;
                    }

                }

            }
        }

        if(count1==0 && count2==0 && count3==0)
            return true;
        else
            return false;
    }
}

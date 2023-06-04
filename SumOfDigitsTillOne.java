package com.examples.concepts;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigitsTillOne {


    public static void main(String[] args) {
        int number = 12345;
        int sum=0;
        while(number>0 || sum > 9)
        {
            if(number==0)
            {
                number=sum;
                sum=0;
            }
            sum+=number%10;
            number=number/10;

        }
        System.out.println(sum);

    }
}

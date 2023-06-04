package com.examples.concepts;

import java.util.Arrays;

public class MaximumDifference {

    public static void main(String[] args) {
        int a[]={12,9,5,2,15,17,1};
        int length=a.length;
        int max=0;
        int index=0;
        for(int i=0;i<length;i++)
        {
            if(max<a[i]){
                max=a[i];
                index=i;
            }
        }
        System.out.println(max);
        int b[]= Arrays.copyOfRange(a,0,index+1);
         System.out.println(Arrays.stream(b).max());
        int temp=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println(Arrays.stream(b).min());
        System.out.println(Arrays.stream(b).max());
        for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
        int diff=b[b.length-1]-b[0];
        System.out.println(diff);
    }
}

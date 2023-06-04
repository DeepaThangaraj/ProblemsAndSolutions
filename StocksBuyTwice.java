package com.examples.concepts;

import java.util.Arrays;

public class StocksBuyTwice {
    public static void main(String[] args) {


        int stock[] = {100, 30, 15, 10, 8, 25, 80};
        int index_array[]=new int[stock.length];
        int max=0;
        int min=0;
        int length= stock.length;
        int copy_of_array[]=new int[length];
        int l=0;
        for(int n:stock)
        {
            copy_of_array[l]=n;
            l++;
        }
        Arrays.sort(copy_of_array);
        for(int i=0;i<length;i++) {
            for(int j=0;j<length;j++) {

                if (copy_of_array[i] ==stock[j])
                {

                   index_array[i]=j;
                }
            }
        }
        int subarray1[]=new int[length/2];
        int subarray2[]=new int[(length/2)+1];
        subarray1=Arrays.copyOfRange(index_array,0,length/2+1);
        subarray2=Arrays.copyOfRange(index_array,length/2+1,length);
        int s=subarray2[0];
        for(int i=0;i<subarray2.length;i++)
        {
            if(subarray2[i]>s)
                s=subarray2[i];
        }



        System.out.println("subarray1");
        for(int i=0;i<subarray1.length;i++)
            System.out.println(subarray1[i]);
        System.out.println("sub Array2");
        for(int i=0;i<subarray2.length;i++)
            System.out.println(subarray2[i]);

        for(int i=0;i<index_array.length;i++)
        System.out.println(index_array[i]);



        //test
        int a=Math.max(Integer.MIN_VALUE,-2);
        System.out.println(a);
    }
}
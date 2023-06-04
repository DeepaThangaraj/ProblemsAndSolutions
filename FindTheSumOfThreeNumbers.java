package com.examples.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FindTheSumOfThreeNumbers {
   public static void main(String[] args)
   {
       int[] a={9,8,7,6,5,4,3};
       int n=a.length;
       int j=0;
       int k =0;
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
           j=i+1;k=i+2;
           while(k<n)
           {

               if( a[i] < a[j] && a[j]>a[k])
               {
                   list.add(a[i]+a[j]+a[k]);
               }
               k++;

           }

       }
       list=list.stream().sorted().collect(Collectors.toList());
       if(!list.isEmpty())
       System.out.println(list.get(0));
       else
           System.out.println("0");
   }
}

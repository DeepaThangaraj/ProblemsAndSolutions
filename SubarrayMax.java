package com.examples.concepts;

public class SubarrayMax {
    public static void main(String[] args)
    {
        int a[]={10, 5, 2, 7, 8, 7};
        int k=3;
        int j=0;
        for(int i=0;i<=a.length-k;i++)
        {
            int max=a[i];
            j=i;
            while(j<i+k) {
                if(a[i]<a[j])
                    max=a[j];
                j++;
            }
            System.out.println(max);

        }
    }
}

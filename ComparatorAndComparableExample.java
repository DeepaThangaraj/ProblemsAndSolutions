package com.examples.concepts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorAndComparableExample {

    public static void main(String[] args) {
        ArrayList<Payment> list=new ArrayList<>();
        list.add(new Payment("Extra","Riyadh Bank",new BigDecimal(120000),2023));
        list.add(new Payment("Carrefour","Alinma Bank",new BigDecimal(123000),2019));
        list.add(new Payment("Amazon","AmazonPay",new BigDecimal(150000),2022));
        for(Payment p:list)
        {
            System.out.println(p.merchant_name+" "+p.merchant_bank+" "+p.amount+" "+p.year);
        }
        System.out.println("After sort........");
        /*Collections.sort(list);
        for(Payment p:list)
        {
            System.out.println(p.merchant_name+" "+p.merchant_bank+" "+p.amount+" "+p.year);
        }

         */

        //comparator
        NameComparator nameComparator=new NameComparator();
        Collections.sort(list,nameComparator);
        System.out.println("After sorting by name");
        for(Payment p:list)
        {
            System.out.println(p.merchant_name+" "+p.merchant_bank+" "+p.amount+" "+p.year);
        }

        AmountComparator amountComparator=new AmountComparator();
        Collections.sort(list,amountComparator);
        System.out.println("After sorting y amount.....");
        for(Payment p:list)
        {
            System.out.println(p.merchant_name+" "+p.merchant_bank+" "+p.amount+" "+p.year);
        }

        ///after all sorting done
        System.out.println("*********************************");
         for(Payment p:list)
             System.out.println(p.merchant_name+" "+p.merchant_bank+" "+p.amount+" "+p.year);

    }

}



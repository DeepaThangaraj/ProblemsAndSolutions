package com.examples.concepts;

import java.util.Comparator;

public class NameComparator implements Comparator<Payment> {
    public int compare(Payment p1,Payment p2){
       return p1.merchant_name.compareTo(p2.merchant_name);
    }
}

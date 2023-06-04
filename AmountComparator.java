package com.examples.concepts;

import java.util.Comparator;

public class AmountComparator implements Comparator<Payment> {

    public int compare(Payment p1,Payment p2)
    {
        return p1.amount.compareTo(p2.amount);
    }
}

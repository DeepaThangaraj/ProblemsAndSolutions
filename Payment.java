package com.examples.concepts;

import java.math.BigDecimal;

public class Payment implements Comparable<Payment> {

    public String merchant_name;
    public String merchant_bank;
    public BigDecimal amount;
    public int year;

    public Payment(String n, String b, BigDecimal a, int y) {
        this.amount = a;
        this.merchant_bank = b;
        this.merchant_name = n;
        this.year = y;
    }

    public int compareTo(Payment payment) {
        return this.year - payment.year;
    }
}

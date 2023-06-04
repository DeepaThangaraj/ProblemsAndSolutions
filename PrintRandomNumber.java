package com.examples.concepts;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class PrintRandomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        random.ints().limit(20).forEach(System.out::println);
        //Code for get maximum value in a list
        List<Integer> numbers= Arrays.asList(1,2,5,12,43,70);
        IntSummaryStatistics statistics=numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println(statistics.getMax());
        LocalDate date1=LocalDate.now();
        LocalDate localDate=LocalDate.of(date1.getYear(),date1.getMonth(),date1.getDayOfMonth());
        LocalDate secondFriday=localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))
                .with(TemporalAdjusters.next(DayOfWeek.FRIDAY))
                .with(TemporalAdjusters.next(DayOfWeek.FRIDAY))
                .with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(secondFriday);


    }
}

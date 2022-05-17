package com.test.demo;

import com.test.demo.linkedlist.ReverseLinkedList;

import java.awt.*;
import java.util.Calendar;

/*
Java Calendar class is an abstract class that provides methods for converting date

between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.

Given the date, month and year. Find what weekday it was.
 */
public class FindDay {
    public static void main(String[] args) {
        int Date = 11;
        int Month = 06;
        int Year = 2724;
        System.out.println(FindDay.findDay(Date, Month, Year));
    }


    static String findDay(int date, int month, int year) {
        //Code Here

        Calendar c = Calendar.getInstance();
        if (month == 12) {
            month = 11;
        }
        c.set(year, month, date);
        System.out.println(c.getTime());
        int day = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);
        if (day == 2) {

            return "MONDAY";
        }
        return "DEFAULT";
    }



}
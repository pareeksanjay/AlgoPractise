package com.test.demo.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*There are n bulbs that are initially off. You first turn on all the bulbs,

then you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.

Return the number of bulbs that are on after n rounds.

 */
public class BulbSwitcher {

    public static void main(String[] args) {
       int noOfBulbs=6;
       int noOfRounds=0;
       for(int i=1;i*i<=noOfBulbs;i++){
           noOfRounds++;
       }


        System.out.println(noOfRounds);
    }
}

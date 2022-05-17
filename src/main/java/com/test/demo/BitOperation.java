package com.test.demo;

public class BitOperation {
    public static void main(String[] args) {
        swapNumbers();
        findOddEven(3);
    }

    private static void findOddEven(int i) {
        if((i&1)==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }

    static void swapNumbers(){
        int a=5;
        int b=7;
        a=a^b; //101^111=010
        b=a^b; //010^111=101
        a=a^b; //010^101=111
        System.out.println("a="+a+","+" b="+b);
    }
}

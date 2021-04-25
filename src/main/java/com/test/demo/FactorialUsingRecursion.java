package com.test.demo;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

    private static int fact(int num){
        if(num ==0){
            return 1;
        }else{
            return num*fact(num-1);
        }

    }
}

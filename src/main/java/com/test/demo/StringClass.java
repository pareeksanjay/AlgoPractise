package com.test.demo;
/*
You are given a string S, convert it into a magical string.
A string can be made into a magical string if the alphabets are
swapped in the given manner: a->z or z->a, b->y or y->b, and so on.
 */
public class StringClass {
    public static void main(String[] args) {
        // code here
        String magical="abcdefghijklmnopqrstuvwxyz";
        int magicLength=magical.length();
        String s= "sanjay";
        StringBuilder newString= new StringBuilder();

        for(int i=0;i<s.length();i++){
            for(int j=0;j<magicLength;j++){
                if(s.charAt(i)==magical.charAt(j)){
                newString.append(magical.charAt(25 - j));

                }
            }
        }
        System.out.println(newString);
    }
}

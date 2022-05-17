package com.test.demo.string.patternmatching;

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;

public class RabinKarpAlgorithm {
    public static void main(String[] args) {
        String seq="aaabcdbddd";
    String pattern="abcd";
        System.out.println(hashing(pattern));

    }


    private static int hashing(String pattern){
        int hash=0;
        for(int i=0;i<pattern.length();i++){
            hash+=(pattern.charAt(i)*Math.pow(10,pattern.length()-1))%Math.pow(2,31);
        }
        return hash;
    }
}

package com.test.demo.string;

public class CompressedString {

    public static void main(String[] args) {
        String s="assdaaccc";
        
        int n=s.length();
        int count=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            count++;
            if(i+1>=n || s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
                sb.append(count);
                count=0;
            }
        }
        System.out.println(sb);
    }
}

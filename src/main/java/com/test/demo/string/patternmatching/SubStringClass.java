package com.test.demo.string.patternmatching;

import org.apache.commons.lang3.StringUtils;

public class SubStringClass {
    public static void main(String[] args) {
        String text="ibs.do_not_migrate.fdsdjsfkdkd.lst.gz";
        String substring= StringUtils.substringBetween(text,"do_not_migrate.",".");
        System.out.println(substring);
    }
}

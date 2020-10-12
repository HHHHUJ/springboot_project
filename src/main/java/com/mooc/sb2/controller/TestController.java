package com.mooc.sb2.controller;


import java.lang.reflect.Array;
import java.util.Arrays;

public class TestController {

    public static void main(String[] args) {
        test();
        test("111111");
        test("2222222", "3333333");
        test("4444444", "5555555","66666666");
    }
    public static void test(String ...args) {
        for(String arg : args) {
            System.out.println(arg);
        }
    }
}

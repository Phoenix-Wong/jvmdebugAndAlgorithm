package com.example.jvmdebugdemo;

/**
 * @author MikeWang
 * @date 2021/3/23 5:40 下午
 */
public class TestStack {

    public static void main(String[] args) {
        int a = 88;
        a= a++;
        System.out.println(a);
    }
}

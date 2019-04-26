package com.thinkinjava.learn.chapter5.question;

/**
 * Created by hx on 2019/4/26.
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        for (String s : trailing) {
            System.out.println(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}

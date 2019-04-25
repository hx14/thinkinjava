package com.thinkinjava.learn.chapter5.question;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hx on 2019/4/25.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}

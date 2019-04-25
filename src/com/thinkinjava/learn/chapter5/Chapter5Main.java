package com.thinkinjava.learn.chapter5;

/**
 * Created by hx on 2019/4/23.
 */
public class Chapter5Main {
    int i = 0;

    Chapter5Main increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Chapter5Main x = new Chapter5Main();
        x.increment().increment().increment().print();
    }
}
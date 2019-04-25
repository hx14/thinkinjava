package com.thinkinjava.learn.chapter5.question;


/**
 * Created by hx on 2019/4/23.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial calue";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ int arg only, s= " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        // 不能出现两个this关键字
        // this(s);
        // 可用于另外一种this
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        // 这里的this因为没有构造器，所以会出现编译错误
        // this(11);
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

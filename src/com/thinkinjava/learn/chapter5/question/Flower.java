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
        // ���ܳ�������this�ؼ���
        // this(s);
        // ����������һ��this
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        // �����this��Ϊû�й����������Ի���ֱ������
        // this(11);
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

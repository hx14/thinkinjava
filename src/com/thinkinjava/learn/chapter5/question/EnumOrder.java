package com.thinkinjava.learn.chapter5.question;

/**
 * Created by hx on 2019/4/26.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ". ordinal" + s.ordinal());// ordinal()������ʾĳ���ض�enum����������˳��
        }
    }
}

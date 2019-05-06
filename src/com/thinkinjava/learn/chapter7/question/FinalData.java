package com.thinkinjava.learn.chapter7.question;

import java.util.Random;

/**
 * Created by hx on 2019/4/29.
 */
class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    // 既是static和final的域将用大写标识并使用下划线分隔每个单词
    private static final int VALUE_TWO = 99;
    // 定义为public，可以用作包之外
    // 定义为static，强调只有一份
    // 定义为final，说明是一个常量
    public static final int VALUE_THREE = 39;
    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    private Value v1 = new Value(11);
    // 不能因为v2是final的，就认为无法改变它的值，由于它是一个引用，final意味着无法将v2再次指向另一个新的对象。对数组具有相同的意义，数组是另一种引用。
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "i4 = " + i4 + ". INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
        System.out.println("fd1");
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
    // 对FinalData进行初始化的时候，i4作为private，在方法每次初始化的时候已经完成初始化，并不会随着方法的初始化而变化，
    // 但是对于INT_5来说，作为static final，只在首次初始化的时候进行装载，但是fd2初始化的时候，INT_5并不会变化
}

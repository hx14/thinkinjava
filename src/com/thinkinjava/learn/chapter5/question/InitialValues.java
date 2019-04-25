package com.thinkinjava.learn.chapter5.question;

/**
 * Created by hx on 2019/4/24.
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues() {
        System.out.println("reference       " + reference);
        // 执行之后为null，原因是在类里定义一个对象的引用时，如果不将其初始化，此引用就会获得一个特殊值null
    }
}

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
        // ִ��֮��Ϊnull��ԭ���������ﶨ��һ�����������ʱ������������ʼ���������þͻ���һ������ֵnull
    }
}

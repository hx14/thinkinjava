package com.thinkinjava.learn.chapter8.question.shape;

import static net.mindview.util.Print.print;

/**
 * Created by hx on 2019/5/6.
 */
public class Triangle extends Shape {
    @Override // ��Բ������͵ļ�飬�����д�Ļ����������ʹ��󲻻ᱨ�����Ǽ���override֮�󣬻ᱨ���͵Ĵ���
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
}

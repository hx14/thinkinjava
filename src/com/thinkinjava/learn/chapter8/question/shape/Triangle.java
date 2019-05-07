package com.thinkinjava.learn.chapter8.question.shape;

import static net.mindview.util.Print.print;

/**
 * Created by hx on 2019/5/6.
 */
public class Triangle extends Shape {
    @Override // 针对参数类型的检查，如果不写的话，参数类型错误不会报错，但是加上override之后，会报类型的错误。
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
}

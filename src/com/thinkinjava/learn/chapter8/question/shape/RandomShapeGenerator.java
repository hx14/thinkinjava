package com.thinkinjava.learn.chapter8.question.shape;

import java.util.Random;

/**
 * Created by hx on 2019/5/6.
 */
public class RandomShapeGenerator {
    private Random random = new Random(47);

    public Shape next() {
        switch (random.nextInt(3)) {
            default:
                // return语句里面发生向上转型，每一个return都指向某个引用
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}

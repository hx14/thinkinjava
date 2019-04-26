package com.thinkinjava.learn.chapter6.question2;

/**
 * Created by hx on 2019/4/26.
 */
public class Cookie {
    public Cookie() {
        System.out.println("Cookie constructor");
    }

    void biteNoExtends() {
        System.out.println("bite");
    }

    protected void biteHasExtends() {
        System.out.println("bite");
    }
}

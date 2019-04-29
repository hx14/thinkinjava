package com.thinkinjava.learn.chapter7.question;

/**
 * Created by hx on 2019/4/29.
 */
class Instrument {
    public void play(){}
    static void tune(Instrument i) {
        i.play();
    }
}
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}

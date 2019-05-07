package com.thinkinjava.learn.chapter8.question;

import static net.mindview.util.Print.print;

/**
 * Created by hx on 2019/5/6.
 */
class Stringed extends Instrument {
    public void play(Note n) {
        print("Stringed.play() " + n);
    }
}
class Brass extends Instrument {
    public  void play(Note n) {
        print("Brass.play() " + n);
    }
}
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frechHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frechHorn);
    }
}

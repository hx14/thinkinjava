package com.thinkinjava.learn.chapter8.question;

import static net.mindview.util.Print.print;

/**
 * Created by hx on 2019/4/29.
 */
class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }
}

public class Wind extends Instrument {// Wind向上转型到Instrument的时候，可能会“缩小”接口，但不会比Instrument更窄。
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}

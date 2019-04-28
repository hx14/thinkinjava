package com.thinkinjava.learn.chapter7.question;

/**
 * Created by hx on 2019/4/28.
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protextor = new SpaceShip("NESA Protector");
        protextor.forward(100);
    }
}

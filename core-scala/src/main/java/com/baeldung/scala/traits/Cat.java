package com.baeldung.scala.traits;

public class Cat implements Animals {

    @Override
    public String eat() {
        return "Cat Food";
    }

    @Override
    public int legs() {
        return 4;
    }

    @Override
    public String nickname() {
        return "Felix";
    }
}
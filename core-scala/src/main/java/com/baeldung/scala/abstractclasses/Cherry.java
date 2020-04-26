package com.baeldung.scala.abstractclasses;

public class Cherry extends Tree {

    public Cherry(String name) {
        super(name);
    }

    @Override
    public boolean hasFruit() {
        return true;
    }
}

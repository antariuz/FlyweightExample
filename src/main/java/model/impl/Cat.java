package model.impl;

import model.Pet;

public class Cat implements Pet {
    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

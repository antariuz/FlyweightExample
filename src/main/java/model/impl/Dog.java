package model.impl;

import model.Pet;

public class Dog implements Pet {
    @Override
    public void sound() {
        System.out.println("woof woof");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}

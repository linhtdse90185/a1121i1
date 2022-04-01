package oop;

import kethua.Animal;
import kethua.Dog;

public class Pig extends Animal {
    public void test() {
        this.getInfo();
        Animal animal = new Pig();
        Pig pig = new Pig();

    }

    @Override
    public void speak() {

    }

    @Override
    public void eat() {

    }

    @Override
    public Animal getAnimal() {
        return null;
    }
}

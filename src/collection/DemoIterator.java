package collection;

import kethua.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("A", 2, "yellow", "A"));
        dogs.add(new Dog("B", 2, "yellow", "B"));
        dogs.add(new Dog("C", 2, "yellow", "C"));
        dogs.add(new Dog("D", 2, "yellow", "D"));
        Iterator<Dog> iterator = dogs.iterator();
        while (iterator.hasNext()) {
            Dog dog = iterator.next();
            System.out.println(dog);
        }
    }
}

package kethua;

public class TestCasting {
    public static void main(String[] args) {
//        Animal animal1 = new Dog();
//        Dog dog = new Dog();
//
//        Animal[] listAnimals = new Animal[4];
//        listAnimals[0] = new Dog();
//        listAnimals[1] = new Cat();
//        listAnimals[0].speak();
//        listAnimals[1].speak();
//        if (listAnimals[0] instanceof Dog) {
//            ((Dog) listAnimals[0]).getDog();
//        }
//
//        System.out.println(Flyable.a);
        test();
    }

    public static void test() {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1 = animal2;
        animal1.speak();
    }
}

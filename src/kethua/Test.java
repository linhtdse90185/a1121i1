package kethua;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog("A", 2.34f, "black", "BB");
//        Dog dog1 = new Dog();
        Animal animal = new Dog("A", 2.34f, "black", "BB");
        System.out.println(animal);
        System.out.println(animal.name);
        float a = (float)5.2;
        Dog dog = (Dog) animal;

        Animal animal1 = new Cat();
        if (animal1 instanceof Dog) {
            Dog dog1 = (Dog) animal1;
        }

        animal.eat();
        animal1.eat();
        cong(3,5);
        cong(3.2,6.7);
    }

    public static int cong(int a, int b) {
        return a + b;
    }

    public static int cong(int a, int b, int c) {
        return a + b + c;
    }

    public static double cong(double a, double b) {
        return a + b;
    }
}

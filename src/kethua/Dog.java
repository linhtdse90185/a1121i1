package kethua;

public class Dog extends Animal {
    public String type;
    public String name;

    public Dog() {}

    public Dog(String name, float weight, String color, String type) {
        super(null, weight, color);
        this.type = type;
        this.name = name;

    }

    public void keepHouse() {
        System.out.println("Keeper house");
    }

    @Override
    public void speak() {
        System.out.println("gâu gâu"); //Bark
    }

    @Override
    public void eat() {
        System.out.println("Dog eat bone");
    }

    @Override
    public Dog getAnimal() {
        System.out.println(super.getInfo());
        return this;
    }

    @Override
    public String getInfo() {
        return type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public void getDog() {
        System.out.println("This is dog");
    }
}

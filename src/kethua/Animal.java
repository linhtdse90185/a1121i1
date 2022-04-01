package kethua;

public abstract class Animal {
    public String name;
    public float weight;
    protected String color;

    public Animal(){
        System.out.println("No param");
    }

    public Animal(String name, float weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        System.out.println("Has param");
    }

    protected abstract void speak();
    public abstract void eat();
    protected String getInfo() {
        return "Name: " + this.name + " |Weight: " + this.weight;
    }

    public abstract Animal getAnimal();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}

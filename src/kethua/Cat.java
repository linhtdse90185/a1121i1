package kethua;

public class Cat extends Animal implements Comparable<Cat>{
    @Override
    protected void speak() {
        System.out.println("Meo meo");
    }

    @Override
    public void eat() {

    }

    @Override
    public Animal getAnimal() {
        return null;
    }

    @Override
    // return > 0 => this > cat
    // return < 0 => this < cat
    // return = 0 => this = cat
    public int compareTo(Cat cat) {
        if (this.weight == cat.weight) {
            // TOm   TamThe
            return this.name.compareTo(cat.name);
        }
        return this.weight - cat.weight > 0 ? 1 : -1;
    }
}

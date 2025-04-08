public class OopInJava {
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.makeSound(); // Polymorphism in action
    }
}

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound(); // Abstraction
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says: Bark!");
    }
}

public class ObjectOrientedInJava {

    // a Function in Java is defined as a block of code that performs a specific
    // task and it's defined inside a class
    // In OOP, every Function is called a method becuase it is tied to an obejct or
    // class

    // example
    public static void main(String[] args) {

        int x = 30;
        int y = 40;

        ObjectOrientedInJava returnResult = new ObjectOrientedInJava();

        int result = returnResult.add(x, y);
        System.out.println("This is the result: " + result);
    }

    public int add(int a, int b) {
        return a + b;
    }

    // 4 Main Concrpt of OOP in Java

    
    // 1. Encapsulation: is the process of hiding the internal details of how an
    // object works or exposing only what is necessary.

    // Example
    public class Person {

        private String name;
        public int age = 9;

        // Public getter and setter
        public String getname() {
            return name;
        }

    }

    // 2. Abstraction : Means showing only relevant detaiuls and hiding complexities

    // Example
    abstract class Animal {
        abstract void makeSound();

        abstract void eatFood();
    }

    class Dog extends Animal {
        public void makeSound() {
            System.out.println("Bark");
        }

        public void eatFood() {
            System.out.println("Meat");
        }
    }

    class Cat extends Animal {
        public void makeSound() {
            System.out.println("Meaw");
        }

        public void eatFood() {
            System.out.println("Meat");
        }
    }

    // 3. Inheritance: lets one class inherit properties and methods from another.

    class Vehicle {
        int speed = 50;

        public void move() {
            System.out.println("Vehicle is moving");
        }
    }

    class MyCar extends Vehicle {
        public void display() {
            System.out.println("My Car Speed is: " + speed);
        }
    }

    // 4. Polymorphism: means many forms the same method behaves differently
    // depending on the use case or context.

    // Example
    class Animal1 {
        public void sound() {
            System.out.println("Animal sound");
        }
    }

    class Cat1 extends Animal1 {
        public void sound() {
            System.out.println("Meow");
        }
    }

}
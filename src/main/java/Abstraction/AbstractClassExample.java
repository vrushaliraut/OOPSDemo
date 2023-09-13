package Abstraction;

/*
- An abstract class must be declared with an abstract keyword.
- It can have abstract and non-abstract methods.
- It cannot be instantiated.
- It can have constructors and static methods also.
- It can have final methods which will force the subclass not to change the body of the method.

* */


abstract class Animal {
    public Animal() {
        System.out.println("You just created a animal..!");
    }

    abstract void walk();

    void sit() {
        System.out.println("Horse never sits");
    }
}

class Horse extends Animal {

    public Horse() {
        System.out.println("Wow, you have created a Horse!");
    }

    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }

    public void sit() {
    }
}

class Chicken extends Animal {

    public Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }

    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.sit();

        Chicken chicken = new Chicken();
        chicken.walk();
    }
}

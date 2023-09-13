package Polymorphism;

/* Dynamic polymorphism

 - Function overriding means when the child class contains the method which is already present in the parent class
 -  the child class overrides the method of the parent class.
 - The call to the function is determined at runtime is known as runtime polymorphism
* */
class Shape {
    public void area() {
        System.out.println("Displays area of a Shape");
    }
}

class Triangle extends Shape {
    public void area(int height, int breadth) {
        System.out.println((0.5) * breadth * height);
    }
}

class Circle extends Shape {
    public void area(int radius) {
        System.out.println((3.14) * radius * radius);
    }
}


public class RunTimePolyMorphism {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area(15, 4);

        Circle circle = new Circle();
        circle.area(4);
    }
}

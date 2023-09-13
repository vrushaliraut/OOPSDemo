package Inheritance;

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

public class SingleInheritance {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area(15, 4);
    }
}

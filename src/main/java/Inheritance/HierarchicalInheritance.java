package Inheritance;

class Shape2 {
    public void area() {
        System.out.println("Displays area of a Shape");
    }
}

class Triangle2 extends Shape2 {
    public void area(int height, int breadth) {
        System.out.println((0.5) * breadth * height);
    }
}

class Circle1 extends Shape2 {
    public void area(int radius) {
        System.out.println((3.14) * radius * radius);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Triangle2 triangle = new Triangle2();
        triangle.area(15, 4);

        Circle1 circle = new Circle1();
        circle.area(4);
    }
}

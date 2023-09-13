package Inheritance;

class Shape1 {
    public void area() {
        System.out.println("Displays area of a Shape");
    }
}

class Triangle1 extends Shape1 {
    public void area(int height, int breadth) {
        System.out.println((0.5) * breadth * height);
    }
}

//doesn't add any new behavior or properties
class EquilateralTriangle extends Triangle1 {
    int side;

}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Triangle1 triangle = new Triangle1();
        triangle.area(15, 4);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();

        // Set the value of the side
        equilateralTriangle.side = 10;

        // Call the area method inherited from Triangle1
        equilateralTriangle.area(equilateralTriangle.side, equilateralTriangle.side);
    }
}

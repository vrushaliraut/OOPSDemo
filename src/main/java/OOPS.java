// Basic Example of Object and class

/* When an object is created using a new keyword, then space is allocated for the variable in a heap,
 and the starting address is stored in the stack memory.
*/

class Pen {
    String color;

    public void printColor() {
        System.out.println("The color of pen is " + this.color);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";

        Pen pen2 = new Pen();
        pen2.color = "black";

        pen1.printColor();
        pen2.printColor();
    }
}

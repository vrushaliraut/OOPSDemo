package Polymorphism;

class Student {
    String name;
    int age;

    //same function name but different functionality
    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int name) {
        System.out.println(name);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayInfo("Bob");
        student.displayInfo(20);
    }
}

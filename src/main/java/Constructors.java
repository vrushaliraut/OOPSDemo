/*
 * 1. Non-Parameterized constructor -  created by default by Java.
 * 2. Parameterized constructor
 * 3. Copy constructor - overloaded constructor used to declare and initialize an object from another object.
 * */


//Non-Parameterized constructor
class Student {
    String name;
    int age;

    public Student() {
        System.out.println("Constructor called");
    }
}

// Parameterized constructor
class Student1 {
    String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Copy Constructor
class Student2 {
    String name;
    int age;

    public Student2(Student student1) {
        this.name = student1.name;
        this.age = student1.age;
    }
}

class Constructor {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Default constructor ::" + student);

        Student1 student1 = new Student1("Bob", 20);
        System.out.println("Parameterized constructor ::" + student1);

        Student2 student2 = new Student2(student);
        System.out.println("Copy constructor ::" + student2);
    }
}
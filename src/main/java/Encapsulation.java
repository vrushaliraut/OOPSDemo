/*
 * Encapsulation is the process of combining data and functions into a single unit called class.
 *  In Encapsulation, the data is not accessed directly;
 *  it is accessed through the functions present inside the class.
 *
 * In simpler words, attributes of the class are kept private and public getter and
 * setter methods are provided to manipulate these attributes.
 * Thus, encapsulation makes the concept of data hiding possible.
 * */

class People {
    String name;
    int age;
    String gender;
    String phonenumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);
    }
}

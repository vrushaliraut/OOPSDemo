package PackagesInJava;

/*
- group of similar types of classes, interfaces and sub-packages.
- can be built-in or user defined

import java.util.Scanner
import java.io.IOException

** Access Modifier in Java

- Private :: - Access level is only within class
- Default :: -  access level of a default modifier is only within the package
             - It cannot be accessed from outside the package
- Protected :: - Access level of a protected modifier is within the package and outside the package through child class
               - If you do not make the child class, it cannot be accessed from outside the package

- Public   :: - access level of a public modifier is everywhere
* */

class Account {
    public String name;
    protected String email;
    private String password;

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class PackagesInJava {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "oops demo";
        account.setPassword("abcd");
        account.email = "oopsconcept@concept.com";
    }
}

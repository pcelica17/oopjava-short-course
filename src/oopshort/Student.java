package oopshort;

public class Student extends User{
    void verify() {
        System.out.println("Verifying through email");
        setVerified(true);
    }
}

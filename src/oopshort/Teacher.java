package oopshort;

public class Teacher extends User{
    void verify() {
        System.out.println("Verifying through phone");
        setVerified(true);
    }
}

package oopshort;

import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("student");
        Teacher t = new Teacher();
        t.setName("teacher");


        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new User("Caleb"));
        User.admins.add(new User("He"));
        User.admins.add(new User("Sally"));

        for (User u : User.admins){
            u.verify();
        }
    }
}
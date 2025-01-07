package oopshort;

import java.util.List;

public class User {
    private String name;
    private String membership = "Bronze";

    private boolean verified = false;

    void setVerified(boolean verified){
        this.verified = verified;
    }

    boolean getVerified(){
        return verified;
    }

    public static List<User> admins;

    void verify() {
        System.out.println("Verifying...");
        setVerified(true);
    }

    public static void printAdminNames(){
        for (User u : admins){
            System.out.println(u.getName());
        }
    }

    public User(String name) {
        setName(name);
    }

    public String toString(){
        return getName() + " " + getMembership();
    }

    public boolean equals(User u2){
        if (getName() == u2.getName() &&
                getMembership() == u2.getMembership()){
            return true;
        }
        else {
            return false;
        }
    }

    public User(){

    }//moramo imati default constructor zbog extendovanja class Student

    public User(String name, String membership) {
        setName(name);
        setMembership(membership);
    }

    void setName(String name) {
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void setMembership(String membership){
        this.membership = membership;
    }

    void setMembership (Membership membership){
        this.membership = membership.name();
    }

    public String getMembership() {
        return membership;
    }
}

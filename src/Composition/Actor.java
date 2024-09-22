package Composition;

import java.util.ArrayList;

public class Actor {

    private String firstName;
    private String lastName;


    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   @Override
    public String toString() {
       return this.firstName + " "+ this.lastName;
    }
}

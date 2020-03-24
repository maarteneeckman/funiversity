package com.switchfully.funiversity.funiversity.Domain;

public class Professor {
    private String id;
    private String firstName;
    private String LastName;

    public Professor(String id, String firstname, String lastname) {
        this.id = id;
        this.firstName = firstname;
        LastName = lastname;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }
}

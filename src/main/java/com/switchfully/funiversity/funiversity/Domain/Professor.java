package com.switchfully.funiversity.funiversity.Domain;

public class Professor {
    String id;
    String firstname;
    String Lastname;

    public Professor(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        Lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return Lastname;
    }
}

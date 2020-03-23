package com.switchfully.funiversity.funiversity.API;

public class UpdateProfessorDto {
    String firstname;
    String Lastname;

    public UpdateProfessorDto(String firstname, String lastname) {

        this.firstname = firstname;
        Lastname = lastname;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return Lastname;
    }
}

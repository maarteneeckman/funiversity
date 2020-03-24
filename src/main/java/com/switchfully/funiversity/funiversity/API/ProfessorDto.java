package com.switchfully.funiversity.funiversity.API;

import java.util.Objects;

public class ProfessorDto {
    private String id;
    private String firstname;
    private String Lastname;

    public ProfessorDto(String id, String firstname, String lastname) {
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final ProfessorDto that = (ProfessorDto) o;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.firstname, that.firstname) &&
                Objects.equals(this.Lastname, that.Lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstname, this.Lastname);
    }
}

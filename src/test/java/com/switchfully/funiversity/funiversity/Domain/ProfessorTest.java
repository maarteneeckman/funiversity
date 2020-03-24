package com.switchfully.funiversity.funiversity.Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void getFirstName_returnsFirstName(){
        //given
        Professor professor = new Professor("17","Albert","Einstein");
        //then
        Assertions.assertEquals(professor.getFirstName(), "Albert");
    }

}
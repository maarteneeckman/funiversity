package com.switchfully.funiversity.funiversity.API;

import com.switchfully.funiversity.funiversity.Domain.Professor;
import com.switchfully.funiversity.funiversity.Domain.ProfessorRepository;
import com.switchfully.funiversity.funiversity.Service.ProfessorMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorControllerTest {

    @Test
    void getAllProfessors_givesListOfProfessors() {
        //given
        ProfessorController controller = new ProfessorController(new ProfessorMapper(), new ProfessorRepository());
        //when
        ProfessorDto  prof1 = controller.createProfessor(new ProfessorDto("15","Alan","Turing"));
        ProfessorDto prof2 = controller.createProfessor(new ProfessorDto("7","Ada","Lovelace"));
        Collection<ProfessorDto> actualResult = controller.getAllProfessors();
        //then
        Assertions.assertThat(actualResult).containsExactlyInAnyOrder(prof1, prof2);
    }

}
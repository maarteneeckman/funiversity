package com.switchfully.funiversity.funiversity.API;

import com.switchfully.funiversity.funiversity.Domain.Professor;
import com.switchfully.funiversity.funiversity.Domain.ProfessorRepository;
import com.switchfully.funiversity.funiversity.Service.ProfessorMapper;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.*;

class ProfessorControllerTest {

    @Test
    void createProfessor_addsProfessorToRepository_andReturnsProfessor() {
        //given
        ProfessorRepository repository = new ProfessorRepository();
        ProfessorController controller = new ProfessorController(new ProfessorMapper(), repository);
        ProfessorDto professorDto = new ProfessorDto("3A", "Maxwell", "Boltzmann");
        //when
        ProfessorDto returnedProfessorDto = controller.createProfessor(professorDto);
        Professor savedProf = repository.getProfessor("3A");
        //then
        assertThat(professorDto.getId()).isEqualTo(savedProf.getId());
        assertThat(professorDto.getFirstname()).isEqualTo(savedProf.getFirstName());
        assertThat(professorDto.getLastname()).isEqualTo(savedProf.getLastName());
        assertThat(returnedProfessorDto).isEqualTo(professorDto);
    }

    @Test
    void getAllProfessors_givesListOfProfessors() {
        //given
        ProfessorController controller = new ProfessorController(new ProfessorMapper(), new ProfessorRepository());
        //when
        ProfessorDto prof1 = controller.createProfessor(new ProfessorDto("15", "Alan", "Turing"));
        ProfessorDto prof2 = controller.createProfessor(new ProfessorDto("7", "Ada", "Lovelace"));
        Collection<ProfessorDto> actualResult = controller.getAllProfessors();
        //then
        assertThat(actualResult).containsExactlyInAnyOrder(prof1, prof2);
    }

    @Test
    void getProfessorById_returnsRequestedProfessor() {
        //given
        ProfessorController controller = new ProfessorController(new ProfessorMapper(), new ProfessorRepository());
        ProfessorDto prof1 = controller.createProfessor(new ProfessorDto("15", "Alan", "Turing"));
        ProfessorDto prof2 = controller.createProfessor(new ProfessorDto("7", "Ada", "Lovelace"));
        //when
        ProfessorDto returnedProfessorDto = controller.getProfessorById("7");
        //then
        assertThat(returnedProfessorDto).isEqualTo(prof2);
    }

    @Test
    void getProfessorById_ifProfessorDoesNotExist_throwException() {
        //given
        ProfessorController controller = new ProfessorController(new ProfessorMapper(), new ProfessorRepository());
        //then
        assertThatThrownBy(() -> controller.getProfessorById("5")).isInstanceOf(IllegalArgumentException.class);
    }




}
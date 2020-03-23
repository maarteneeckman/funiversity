package com.switchfully.funiversity.funiversity.Service;

import com.switchfully.funiversity.funiversity.API.ProfessorDto;
import com.switchfully.funiversity.funiversity.API.UpdateProfessorDto;
import com.switchfully.funiversity.funiversity.Domain.Professor;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapper {

    public Professor profDtoToProf(ProfessorDto professorDto){

        return new Professor(professorDto.getId(), professorDto.getFirstname(), professorDto.getLastname());
    }

    public ProfessorDto profToProfDto(Professor professor){
        return new ProfessorDto(professor.getId(), professor.getFirstname(), professor.getLastname());
    }

    public Professor updateDtoToProfessor(UpdateProfessorDto updateProfessorDto, String id) {
        return new Professor(id, updateProfessorDto.getFirstname(), updateProfessorDto.getLastname());
    }
}

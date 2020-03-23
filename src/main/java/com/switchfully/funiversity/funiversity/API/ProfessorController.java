package com.switchfully.funiversity.funiversity.API;

import com.switchfully.funiversity.funiversity.Domain.Professor;
import com.switchfully.funiversity.funiversity.Domain.ProfessorRepository;
import com.switchfully.funiversity.funiversity.Service.ProfessorMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/professors")
public class ProfessorController {

    ProfessorMapper professorMapper;
    ProfessorRepository professorRepository;

    private final Logger myLogger= LoggerFactory.getLogger(ProfessorController.class);

    @Autowired
    public ProfessorController(ProfessorMapper professorMapper , ProfessorRepository professorRepository) {
        this.professorMapper = professorMapper;
        this.professorRepository = professorRepository;
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseStatus (HttpStatus.CREATED)
    public ProfessorDto createProfessor(@RequestBody ProfessorDto professorDto){
        myLogger.info("A new professor was created.");
     professorRepository.addProfessor(  professorMapper.profDtoToProf(professorDto));
        return professorDto;
    }

    @GetMapping(produces = "application/json" )
    @ResponseStatus (HttpStatus.OK)
    public Collection<Professor> getAllProfessors() {
       myLogger.info("List of professors was returned.");
        return professorRepository.getAllProfessors();
    }

    @GetMapping(produces = "application/json" , path = "{id}")
    @ResponseStatus (HttpStatus.OK)
    public ProfessorDto getProfessorById(@PathVariable String id) {
        return professorMapper.profToProfDto( professorRepository.getProfessor(id));
    }

    @PutMapping(produces = "application/json", consumes = "application/json" , path = "{id}")
    @ResponseStatus (HttpStatus.OK)
    public ProfessorDto updateProfessor(@RequestBody UpdateProfessorDto updateProfessorDto , @PathVariable String id){
       if ( professorRepository.getProfessor(id) == null) {
           myLogger.error("Professor doesn't exist.");
           throw  new IllegalArgumentException("Professor doesnt exist");}
        Professor professor = professorMapper.updateDtoToProfessor(updateProfessorDto, id);
        professorRepository.addProfessor(professor);
        return professorMapper.profToProfDto( professor);
    }



    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProfessor(@PathVariable String id) {
        professorRepository.deleteProfessor(id);
    }

}

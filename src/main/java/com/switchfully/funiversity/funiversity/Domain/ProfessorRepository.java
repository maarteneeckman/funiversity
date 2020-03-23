package com.switchfully.funiversity.funiversity.Domain;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProfessorRepository {
    private Map<String, Professor> professorMap = new HashMap<>();


    public void addProfessor(Professor professor){
        professorMap.put(professor.getId(), professor);
    }

//    public void updateProfessor(Professor professor , String id){
//        professorMap.put(id, professor);
//    }

    public Collection<Professor> getAllProfessors(){
        return professorMap.values();
    }

    public Professor getProfessor(String id) {
       return professorMap.get(id);
    }

    public void deleteProfessor(String id) {
        professorMap.remove(id);
    }



}

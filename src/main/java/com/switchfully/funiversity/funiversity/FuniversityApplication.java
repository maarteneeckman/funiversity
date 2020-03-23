package com.switchfully.funiversity.funiversity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FuniversityApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuniversityApplication.class, args);

//        ProfessorRepository professorRepository = new ProfessorRepository();
//        Professor professor1 = new Professor("1","bart","bartmands");
//        professorRepository.addProfessor(professor1);
//        System.out.println(professorRepository.getAllProfessors());
    }

}

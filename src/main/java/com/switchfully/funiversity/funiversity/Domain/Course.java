package com.switchfully.funiversity.funiversity.Domain;

public class Course {

   private String id;
   private String name;
   private int studyPoints;
   private Professor professor;

    public Course(String id, String name, int studyPoints, Professor professor) {
        this.id = id;
        this.name = name;
        this.studyPoints = studyPoints;
        this.professor = professor;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public Professor getProfessor() {
        return professor;
    }
}

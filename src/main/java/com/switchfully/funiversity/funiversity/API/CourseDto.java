package com.switchfully.funiversity.funiversity.API;

public class CourseDto {

    private String id;
    private String name;
    private int studyPoints;
    private ProfessorDto professorDto;

    public CourseDto(String id, String name, int studyPoints, ProfessorDto professorDto) {
        this.id = id;
        this.name = name;
        this.studyPoints = studyPoints;
        this.professorDto = professorDto;
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

    public ProfessorDto getProfessorDto() {
        return professorDto;
    }
}

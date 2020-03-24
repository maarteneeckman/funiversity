package com.switchfully.funiversity.funiversity.API;

import java.util.Objects;

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


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final CourseDto courseDto = (CourseDto) o;
        return this.studyPoints == courseDto.studyPoints &&
                Objects.equals(this.id, courseDto.id) &&
                Objects.equals(this.name, courseDto.name) &&
                Objects.equals(this.professorDto, courseDto.professorDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.studyPoints, this.professorDto);
    }
}

package com.switchfully.funiversity.funiversity.Service;

import com.switchfully.funiversity.funiversity.API.CourseDto;
import com.switchfully.funiversity.funiversity.Domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class CourseMapper {

    ProfessorMapper professorMapper;

    @Autowired
    public CourseMapper(ProfessorMapper professorMapper) {
        this.professorMapper = professorMapper;
    }

    public Course courseDtoToCourse (CourseDto courseDto) {

        return new Course(courseDto.getId(), courseDto.getName(), courseDto.getStudyPoints(), professorMapper.profDtoToProf( courseDto.getProfessorDto()));
    }

    public CourseDto courseToCourseDto (Course course){
        return new CourseDto(course.getId(),course.getName(), course.getStudyPoints(), professorMapper.profToProfDto(course.getProfessor()));
    }

    public Collection<CourseDto> courseListToCourseDtoList(Collection<Course> courseCollection) {
        return courseCollection.stream()
                .map(course -> courseToCourseDto(course))
                .collect(Collectors.toList());
    }


}

package com.switchfully.funiversity.funiversity.API;

import com.switchfully.funiversity.funiversity.Domain.CourseRepository;
import com.switchfully.funiversity.funiversity.Domain.ProfessorRepository;
import com.switchfully.funiversity.funiversity.Service.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "courses")
public class CourseController {

    CourseRepository courseRepository;
    CourseMapper courseMapper;
    ProfessorRepository professorRepository;

    @Autowired
    public CourseController(CourseRepository courseRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CourseDto createCourse(@RequestBody CourseDto courseDto) {

//        if(professorRepository.getProfessor(courseDto.getProfessorDto().getId())==null){
//            throw new IllegalArgumentException("Professor does not exist.");
//        }
        courseRepository.addCourse( courseMapper.courseDtoToCourse(courseDto));
        return courseDto;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Collection<CourseDto> getAllCourses() {
      return courseMapper.courseListToCourseDtoList(courseRepository.getAllCourses());
    }


}

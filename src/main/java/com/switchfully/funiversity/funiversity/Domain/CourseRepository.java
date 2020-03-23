package com.switchfully.funiversity.funiversity.Domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Component
public class CourseRepository {

    Map<String, Course> courseMap;

    @Autowired
    public CourseRepository() {
        courseMap = new HashMap<>();
    }

    public void addCourse(Course course) {
        courseMap.put(course.getId(), course);
    }

    public Collection<Course> getAllCourses() {
        return courseMap.values();
    }

}

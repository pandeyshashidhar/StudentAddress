package com.cleancode.studentadd.controller;


import com.cleancode.studentadd.dto.Course;
import com.cleancode.studentadd.dto.SubCourse;
import com.cleancode.studentadd.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CourseController {

    @Value("${valores.valor_fijo}")
    String valorFijo;

    @Autowired
    private CourseService courseService;

    @GetMapping("/getCourse")
    public List<Course> getCourse() {
        return courseService.getCourse();

    }
    @GetMapping("/getSubCourse/{courseId}")
    public List<SubCourse> getSubCourse(@PathVariable("courseId") Integer courseId) {
        return courseService.getSubCourse(courseId);

    }
}

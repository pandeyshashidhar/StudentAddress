package com.cleancode.studentadd.service;


import com.cleancode.studentadd.dto.Course;
import com.cleancode.studentadd.dto.SubCourse;

import java.util.List;

public interface CourseService {
    public List<Course> getCourse();
    public List<SubCourse> getSubCourse(Integer courseId);
}

package com.cleancode.studentadd.service.impl;


import com.cleancode.studentadd.Repository.CourseRepository;
import com.cleancode.studentadd.Repository.SubCourseRepository;
import com.cleancode.studentadd.dto.Course;
import com.cleancode.studentadd.dto.SubCourse;
import com.cleancode.studentadd.entity.CourseEntity;
import com.cleancode.studentadd.entity.SubCourseEntity;
import com.cleancode.studentadd.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CourseServiceImpl implements CourseService {

@Autowired
CourseRepository courseRepository;

@Autowired
    SubCourseRepository subCourseRepository;



    public List<Course> getCourse(){/*
        List<Course> courseList = new ArrayList<>();
        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Java");
        courseList.add(course);
        Course course1 = new Course();
        course1.setCourseId(2);
        course1.setCourseName("Spring");
        courseList.add(course1);
        return courseList;*/

        List<CourseEntity> cousreList = courseRepository.findAll();

        List<Course> courseDtoList = new ArrayList<>();
        for(CourseEntity course : cousreList){
        Course courseObj = new Course();
            courseObj.setCourseId(course.getCourse_id());
            courseObj.setCourseName(course.getCourseName());
            courseDtoList.add(courseObj);

        }

        return courseDtoList;
    }
    public List<SubCourse> getSubCourse(Integer courseId){
        //List<SubCourse> subCourseList = new ArrayList<>();

        List<Object[]> subCourseEntities = subCourseRepository.findSubCourseEntitiesByCourseCourseId(courseId);
        List<SubCourse> subCourseList =new ArrayList<>();
        for(Object[] obj : subCourseEntities){
            SubCourse subCourse = new SubCourse();
            subCourse.setSubCourseId(Integer.getInteger(obj[0].toString()));
            subCourse.setSubCourseName(obj[1].toString());
            subCourseList.add(subCourse);
        }

        return subCourseList;
    }
}

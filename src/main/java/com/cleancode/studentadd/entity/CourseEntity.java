package com.cleancode.studentadd.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "course")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer course_id;

    @Column(length = 256)
    private String courseName;

    @OneToMany(mappedBy="courseEntityObj",cascade = CascadeType.ALL)
    private Set<SubCourseEntity> subCourseEntitySetSet;

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<SubCourseEntity> getSubCourseSetSet() {
        return subCourseEntitySetSet;
    }

    public void setSubCourseSetSet(Set<SubCourseEntity> subCourseEntitySetSet) {
        this.subCourseEntitySetSet = subCourseEntitySetSet;
    }
}

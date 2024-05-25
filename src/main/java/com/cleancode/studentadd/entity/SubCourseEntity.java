package com.cleancode.studentadd.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subCourse")
public class SubCourseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer subCourse_id;

  @Column(length = 128, nullable = false)
  private String subCourse_Name;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="course_Id", nullable=false)
  private CourseEntity courseEntityObj;


  public Integer getSubCourse_id() {
    return subCourse_id;
  }

  public void setSubCourse_id(Integer subCourse_id) {
    this.subCourse_id = subCourse_id;
  }

  public String getSubCourse_Name() {
    return subCourse_Name;
  }

  public void setSubCourse_Name(String subCourse_Name) {
    this.subCourse_Name = subCourse_Name;
  }

  public CourseEntity getCourseObj() {
    return courseEntityObj;
  }

  public void setCourseObj(CourseEntity courseEntityObj) {
    this.courseEntityObj = courseEntityObj;
  }
}

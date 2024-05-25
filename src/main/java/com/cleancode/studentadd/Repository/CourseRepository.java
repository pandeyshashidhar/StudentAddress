package com.cleancode.studentadd.Repository;

import com.cleancode.studentadd.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <CourseEntity, Integer>{



}

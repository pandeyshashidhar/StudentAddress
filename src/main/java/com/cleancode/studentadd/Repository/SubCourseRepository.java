package com.cleancode.studentadd.Repository;

import com.cleancode.studentadd.entity.SubCourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCourseRepository extends JpaRepository <SubCourseEntity, Integer> {

    @Query(nativeQuery = true,
            value = "SELECT * from sub_course subC where subC.course_id=:courseId")
    List<Object[]> findSubCourseEntitiesByCourseCourseId(Integer courseId);
}

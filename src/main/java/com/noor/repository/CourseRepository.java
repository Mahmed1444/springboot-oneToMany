package com.noor.repository;

import com.noor.entity.Course;
import com.noor.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}

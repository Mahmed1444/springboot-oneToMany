package com.noor.service;

import com.noor.entity.Course;
import com.noor.entity.Instructor;
import com.noor.repository.CourseRepository;
import com.noor.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;



    @Override
    public Course createNew(Course course) {
        return courseRepository.save(course);
    }
}

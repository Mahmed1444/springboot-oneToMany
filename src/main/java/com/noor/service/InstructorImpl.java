package com.noor.service;

import com.noor.entity.Instructor;
import com.noor.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorImpl implements IInstructorService{
    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public Instructor createNew(Instructor instructor) {

        return instructorRepository.save(instructor);
    }
}

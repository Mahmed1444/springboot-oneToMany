package com.noor.Controller;

import com.noor.entity.Instructor;
import com.noor.service.IInstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private IInstructorService instructorService;
    @PostMapping("/create")
    public ResponseEntity<Instructor> create(@RequestBody Instructor instructor){
        Instructor result = instructorService.createNew(instructor);
        return new ResponseEntity<Instructor>(result, HttpStatus.OK);
    }
}

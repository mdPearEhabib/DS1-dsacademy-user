package com.dailystar.dsacademy.controller;

import com.dailystar.dsacademy.services.CourseEnrollmentService;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseEnrollmentController {

    private final CourseEnrollmentService courseEnrollmentService;

    public CourseEnrollmentController(@Lazy CourseEnrollmentService courseEnrollmentService){
        this.courseEnrollmentService=courseEnrollmentService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveCourseEnrollment(){
        courseEnrollmentService.courseAdd();
        return "math";
    }
}

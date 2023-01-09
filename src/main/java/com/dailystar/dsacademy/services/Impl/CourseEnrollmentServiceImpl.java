package com.dailystar.dsacademy.services.Impl;

import com.dailystar.dsacademy.domain.model.CourseEnrollment;
import com.dailystar.dsacademy.repository.CourseEnrollmentRepository;
import com.dailystar.dsacademy.services.CourseEnrollmentService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {

    private final CourseEnrollmentRepository courseEnrollmentRepository;

    public CourseEnrollmentServiceImpl(@Lazy CourseEnrollmentRepository courseEnrollmentRepository){
        this.courseEnrollmentRepository=courseEnrollmentRepository;
    }
    @Override
    public void courseAdd() {

        CourseEnrollment courseEnrollment = new CourseEnrollment();
        courseEnrollment.setEnrollment("habib");
        courseEnrollment.setCategory_id("science");
        courseEnrollmentRepository.save(courseEnrollment);
        System.out.println("course add service is called.");
    }
}

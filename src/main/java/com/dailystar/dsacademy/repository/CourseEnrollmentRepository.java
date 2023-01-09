package com.dailystar.dsacademy.repository;

import com.dailystar.dsacademy.domain.model.CourseEnrollment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEnrollmentRepository extends MongoRepository<CourseEnrollment,String> {

}

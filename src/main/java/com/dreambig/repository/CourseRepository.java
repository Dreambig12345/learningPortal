package com.dreambig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dreambig.model.Course;
import com.dreambig.model.Training;
import com.dreambig.model.User;

@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Long> {
	
}

package com.dreambig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dreambig.model.Training;
import com.dreambig.model.User;

@Repository("trainingRepository")
public interface TrainingRepository extends JpaRepository<Training, Long> {
	
}

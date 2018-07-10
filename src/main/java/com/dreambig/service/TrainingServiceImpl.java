package com.dreambig.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreambig.model.Training;
import com.dreambig.repository.TrainingRepository;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingRepository trainingRepository;

	@Override
	public List<Training> findAll() {

		return trainingRepository.findAll();
	}

}

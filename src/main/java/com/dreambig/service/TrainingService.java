package com.dreambig.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dreambig.model.Training;


public interface TrainingService {
	public List<Training> findAll();
	
}

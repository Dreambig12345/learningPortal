package com.dreambig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreambig.model.Project;
import com.dreambig.model.Skill;
import com.dreambig.repository.ProjectRepository;
import com.dreambig.service.ProjectService;



@Service("projectService")
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public List<Project> viewAllProjects() {
		return projectRepository.findAll();
	}
	@Override
	public List<Project> findProjectBySkill(Skill skill) {
		return projectRepository.findProjectBySkill(skill);
	}
	
}

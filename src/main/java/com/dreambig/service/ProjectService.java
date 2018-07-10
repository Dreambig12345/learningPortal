package com.dreambig.service;

import java.util.List;

import com.dreambig.model.Project;
import com.dreambig.model.Skill;

public interface ProjectService {
	List<Project> viewAllProjects();
	List<Project> findProjectBySkill(Skill skill);
}

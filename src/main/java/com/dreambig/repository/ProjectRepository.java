package com.dreambig.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dreambig.model.Project;
import com.dreambig.model.Skill;

@Repository("projectRepository")
public interface ProjectRepository extends JpaRepository<Project, Long> {
	List<Project> findProjectBySkill(Skill skill);
}

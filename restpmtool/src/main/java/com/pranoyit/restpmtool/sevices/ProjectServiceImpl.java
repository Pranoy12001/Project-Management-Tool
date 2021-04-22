package com.pranoyit.restpmtool.sevices;

import com.pranoyit.restpmtool.domain.Project;
import com.pranoyit.restpmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{
    ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project saveOrUpdateProject(Project project) {
        return projectRepository.save(project);
    }
}

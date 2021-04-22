package com.pranoyit.restpmtool.sevices;

import com.pranoyit.restpmtool.domain.Project;
import com.pranoyit.restpmtool.exceptions.ProjectIdException;
import com.pranoyit.restpmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ProjectServiceImpl implements ProjectService {
    ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project saveOrUpdateProject(Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch (Exception ex) {
            throw new ProjectIdException("project Id '" + project.getProjectIdentifier() + "' is already used.");
        }
    }

    @Override
    public Project findByProjectIdentifier(String projectId) {
        Project project = projectRepository.findByProjectIdentifier(projectId);

        if (Objects.isNull(project)) {
            throw new ProjectIdException("project Id '" + projectId + "' is doesn't exists.");
        }
        return project;
    }
}

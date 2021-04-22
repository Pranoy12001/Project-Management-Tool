package com.pranoyit.restpmtool.sevices;

import com.pranoyit.restpmtool.domain.Project;

public interface ProjectService {
    public Project saveOrUpdateProject(Project project);

    public Project findByProjectIdentifier(String projectId);

    public Iterable<Project> findAllProjects();
}

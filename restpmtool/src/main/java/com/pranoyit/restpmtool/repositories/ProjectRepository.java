package com.pranoyit.restpmtool.repositories;

import com.pranoyit.restpmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    public Project findByProjectIdentifier(String projectId);

    @Override
    Iterable<Project> findAll();
}

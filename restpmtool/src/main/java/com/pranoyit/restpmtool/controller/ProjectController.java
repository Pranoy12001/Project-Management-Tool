package com.pranoyit.restpmtool.controller;

import com.pranoyit.restpmtool.domain.Project;
import com.pranoyit.restpmtool.sevices.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/addProject")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project) {
        return new ResponseEntity<Project>(projectService.saveOrUpdateProject(project),
                HttpStatus.CREATED);
    }
}

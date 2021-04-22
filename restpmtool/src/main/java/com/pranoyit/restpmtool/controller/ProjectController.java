package com.pranoyit.restpmtool.controller;

import com.pranoyit.restpmtool.domain.Project;
import com.pranoyit.restpmtool.sevices.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/addProject")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<String>("Project Object is invalid", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Project>(projectService.saveOrUpdateProject(project),
                HttpStatus.CREATED);
    }
}

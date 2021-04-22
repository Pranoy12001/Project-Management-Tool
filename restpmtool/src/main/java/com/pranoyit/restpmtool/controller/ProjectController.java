package com.pranoyit.restpmtool.controller;

import com.pranoyit.restpmtool.domain.Project;
import com.pranoyit.restpmtool.sevices.DataValidationErrorService;
import com.pranoyit.restpmtool.sevices.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    ProjectService projectService;
    DataValidationErrorService dataValidationErrorService;

    @Autowired
    public ProjectController(ProjectService projectService,
                             DataValidationErrorService dataValidationErrorService) {
        this.projectService = projectService;
        this.dataValidationErrorService = dataValidationErrorService;
    }

    @PostMapping("/addProject")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result) {
        if (result.hasErrors()) {
            return dataValidationErrorService.getDataValidationErrors(result);
        }
        return new ResponseEntity<>(projectService.saveOrUpdateProject(project),
                HttpStatus.CREATED);
    }
}

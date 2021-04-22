package com.pranoyit.restpmtool.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date startDate;
    private Date endDate;

    private Date createdDateTM;
    private Date updatedDateTM;

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreatedDateTM() {
        return createdDateTM;
    }

    public void setCreatedDateTM(Date createdDateTM) {
        this.createdDateTM = createdDateTM;
    }

    public Date getUpdatedDateTM() {
        return updatedDateTM;
    }

    public void setUpdatedDateTM(Date updatedDateTM) {
        this.updatedDateTM = updatedDateTM;
    }

    @PrePersist
    protected void onCreate() {
        this.createdDateTM = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedDateTM = new Date();
    }
}

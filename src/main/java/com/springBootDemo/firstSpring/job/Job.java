package com.springBootDemo.firstSpring.job;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //(name = "job") <- use this to add table in db with name other than class | default name will be class name
public class Job {
    @Id // id annotation
    private Long id;
    private String title;
    private String description;
    private String  minSalary;
    private String maxSalary;
    private String location;
    public Job(Long id, String title, String description, String minSalary, String maxSalary, String location){
        this.id = id;
        this.title = title;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.description = description;
        this.location = location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public String getLocation() {
        return location;
    }
}

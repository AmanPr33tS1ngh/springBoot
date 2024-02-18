package com.springBootDemo.firstSpring.job;

import com.springBootDemo.firstSpring.companies.model.Company;
import jakarta.persistence.*;

@Entity //(name = "job") <- use this to add table in db with name other than class | default name will be class name
public class Job {
    @Id // id annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for generation of id++
    private Long id;
    private String title;
    private String description;
    private String  minSalary;
    private String maxSalary;
    private String location;
    @ManyToOne
    private Company company;

    public Job() {} // need to have this for object creation
    public Job(Company company) {
        this.company = company;
    } // need to have this for object creation

    public Job(Long id, String title, String description, String minSalary, String maxSalary, String location, Company company){
        this.id = id;
        this.title = title;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.description = description;
        this.location = location;
        this.company = company;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

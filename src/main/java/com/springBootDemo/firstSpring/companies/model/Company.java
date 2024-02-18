package com.springBootDemo.firstSpring.companies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springBootDemo.firstSpring.job.Job;
import com.springBootDemo.firstSpring.reviews.model.Review;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Review> reviews;
//    private List<Reviews> jobs;
    public Company(){}
    public Company(List<Review> reviews){
        this.reviews = reviews;
    }

    public Company(Long id, String name, String description, List<Job> jobs){
        this.id = id;
        this.name = name;
        this.description = description;
        this.jobs = jobs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}

package com.springBootDemo.firstSpring.reviews.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springBootDemo.firstSpring.companies.model.Company;
import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double rating;
    @JsonIgnore
    @ManyToOne
    private Company company;

    public Review() {
    }
    public Review(Company company) {
        this.company = company;
    }
    public Review(Long id, String title, String description, double rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

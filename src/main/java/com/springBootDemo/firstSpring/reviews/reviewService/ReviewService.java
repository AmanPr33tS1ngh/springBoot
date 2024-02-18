package com.springBootDemo.firstSpring.reviews.reviewService;


import com.springBootDemo.firstSpring.companies.model.Company;
import com.springBootDemo.firstSpring.reviews.model.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> getAllReviews(Long id);

    public Review createReview(Long companyId, Review review);

    public Review getReviewById(Long companyId, Long  id);
}

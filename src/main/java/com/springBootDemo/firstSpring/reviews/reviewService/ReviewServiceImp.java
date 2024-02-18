package com.springBootDemo.firstSpring.reviews.reviewService;

import com.springBootDemo.firstSpring.companies.companyService.CompanyService;
import com.springBootDemo.firstSpring.companies.companyService.CompanyServiceImp;
import com.springBootDemo.firstSpring.companies.model.Company;
import com.springBootDemo.firstSpring.reviews.model.Review;
import com.springBootDemo.firstSpring.reviews.reviewRepo.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImp implements ReviewService{
    private ReviewRepository reviewRepository;
    private CompanyService companyService;
    public ReviewServiceImp(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }
    @Override
    public List<Review> getAllReviews(Long id) {
        return reviewRepository.findByCompanyId(id);
    }
    @Override
    public Review createReview(Long id, Review review) {
        Company company = this.companyService.getCompanyById(id);
        if (company != null) {
            review.setCompany(company);
            this.reviewRepository.save(review);
            return review;
        }
        return null;
    }

    @Override
    public Review getReviewById(Long companyId, Long id) {
        List<Review> reviews = this.reviewRepository.findByCompanyId(companyId);
        return reviews.stream().filter(review -> review.getId().equals(id)).findFirst().orElse(null);
    }
}

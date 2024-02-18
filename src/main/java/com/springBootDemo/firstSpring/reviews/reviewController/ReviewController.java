package com.springBootDemo.firstSpring.reviews.reviewController;

import com.springBootDemo.firstSpring.reviews.model.Review;
import com.springBootDemo.firstSpring.reviews.reviewService.ReviewService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {
    private ReviewService reviewService;
    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }
    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId){
        return new ResponseEntity<>(this.reviewService.getAllReviews(companyId), HttpStatus.OK);
    }
    @PostMapping("/create_review")
    public ResponseEntity<Review> createReview(@PathVariable Long companyId, @RequestBody Review review){
        return new ResponseEntity<>(this.reviewService.createReview(companyId, review), HttpStatus.OK);
    }
    @GetMapping("/reviews/{id}")
    public ResponseEntity<Review> getReviewById(@PathVariable Long companyId, @PathVariable Long id){
        return new ResponseEntity<>(this.reviewService.getReviewById(companyId, id), HttpStatus.OK);
    }
}

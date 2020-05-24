package kr.co.pastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.Review;
import kr.co.fastcampus.eatgo.domain.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    private ReviewRepository reviewRepositorty;

    @Autowired
    public ReviewService(ReviewRepository reviewRepositorty) {
        this.reviewRepositorty = reviewRepositorty;
    }

    public Review addReview(Long restaurantId, Review review) {
        review.setRestaurantId(restaurantId);
        return reviewRepositorty.save(review);
    }
}

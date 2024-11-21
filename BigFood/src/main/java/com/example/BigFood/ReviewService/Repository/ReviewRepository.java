package com.example.BigFood.ReviewService.Repository;

import com.example.BigFood.ReviewService.Entity.Review;
import com.example.BigFood.ReviewService.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByUser(User user);
}

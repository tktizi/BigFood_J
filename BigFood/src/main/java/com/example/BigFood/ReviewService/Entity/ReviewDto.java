package com.example.BigFood.ReviewService.Entity;

import lombok.Data;

@Data
public class ReviewDto {
    private Long userId;
    private String comment;
    private Integer rating;
}

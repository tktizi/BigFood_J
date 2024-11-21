package com.example.BigFood.ReviewService.Repository;

import com.example.BigFood.ReviewService.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}


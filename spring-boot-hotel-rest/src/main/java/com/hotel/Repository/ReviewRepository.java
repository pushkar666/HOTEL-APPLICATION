package com.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.Entity.Review;


public interface ReviewRepository extends JpaRepository<Review, Integer>{
    
}

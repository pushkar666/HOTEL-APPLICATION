package com.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.Entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    
}

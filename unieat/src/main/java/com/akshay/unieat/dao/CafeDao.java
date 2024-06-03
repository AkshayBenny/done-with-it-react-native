package com.akshay.unieat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.unieat.model.Cafe;

public interface CafeDao extends JpaRepository<Cafe, Integer> {
    
}

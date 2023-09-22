package com.inframart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inframart.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	

}

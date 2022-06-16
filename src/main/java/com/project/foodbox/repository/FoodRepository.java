package com.project.foodbox.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.foodbox.model.Food;

public interface FoodRepository extends JpaRepository<Food,Long>{
	Optional<Food> findById(long id);
}

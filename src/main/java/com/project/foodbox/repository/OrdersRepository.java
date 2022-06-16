package com.project.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.foodbox.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>  {

}

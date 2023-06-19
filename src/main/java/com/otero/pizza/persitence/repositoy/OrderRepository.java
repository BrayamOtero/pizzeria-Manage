package com.otero.pizza.persitence.repositoy;

import com.otero.pizza.persitence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}

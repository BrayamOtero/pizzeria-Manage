package com.otero.pizza.persitence.repositoy;

import com.otero.pizza.persitence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
}

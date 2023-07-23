package com.otero.pizza.persitence.repositoy;

import com.otero.pizza.persitence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}

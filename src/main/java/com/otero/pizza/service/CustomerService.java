package com.otero.pizza.service;

import com.otero.pizza.persitence.entity.CustomerEntity;
import com.otero.pizza.persitence.repositoy.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;


    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity findByPhone(String phone){
        return this.customerRepository.findByPhoneNumber(phone);
    }
}

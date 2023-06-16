package com.otero.pizza.persitence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @Column(name = "id_customer", nullable = false, length = 15)
    private String idCustomer;

    @Column(unique = true, length = 60)
    private String name;

    @Column(length = 100)
    private String address;

    @Column(unique = true, nullable = false, length = 50)
    private String email;

    @Column(name = "phone_number",length = 20)
    private String phoneNumber;
}

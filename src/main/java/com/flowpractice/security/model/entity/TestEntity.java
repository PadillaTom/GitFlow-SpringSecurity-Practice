package com.flowpractice.security.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "test_entity")
@Data
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String password;

}

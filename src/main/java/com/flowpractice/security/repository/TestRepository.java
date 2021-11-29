package com.flowpractice.security.repository;

import com.flowpractice.security.model.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository  extends JpaRepository<TestEntity, Integer> {

    List<TestEntity> findByEmail(String email);

}

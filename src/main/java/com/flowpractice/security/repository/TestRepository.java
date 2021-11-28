package com.flowpractice.security.repository;

import com.flowpractice.security.model.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository  extends JpaRepository<TestEntity, Integer> {

    TestEntity findByEmail(String email);

}

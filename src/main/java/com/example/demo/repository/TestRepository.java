package com.example.demo.repository;

import com.example.demo.entity.TestEntity;

import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestEntity, Integer> {
}
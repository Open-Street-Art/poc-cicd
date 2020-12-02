package com.example.demo.controller;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private TestRepository testRepo;

	@GetMapping(value="/test")
	public ResponseEntity<String> getTest() {
		TestEntity test = new TestEntity();
		testRepo.save(test);
		return ResponseEntity.ok("Ceci est une réponse");
	}
}
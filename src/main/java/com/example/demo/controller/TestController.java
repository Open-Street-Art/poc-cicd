package com.example.demo.controller;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private TestRepository testRepo;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public ResponseEntity<?> getTest() {
		TestEntity test = new TestEntity();
		testRepo.save(test);
		return ResponseEntity.ok("Ceci est un test");
	}
}
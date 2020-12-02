package com.example.demo;

import com.example.demo.controller.TestController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TestController testController;

	@Test
	void contextLoads() {
		Assert.isTrue(testController != null, "test");
	}

}

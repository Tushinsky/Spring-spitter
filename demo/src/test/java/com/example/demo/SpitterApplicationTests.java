package com.example.demo;

import com.example.demo.domain.MindMagician;
import com.example.demo.domain.Volunteer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpitterApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void magicianShouldReaderVolunteersMind() {
		Volunteer volunteers = new Volunteer();
		MindMagician mindMagician = new MindMagician();
		volunteers.thinkOfSomething("Queen of Harts");
		assertEquals("Queen of Harts", mindMagician.getThougths());
	}
}

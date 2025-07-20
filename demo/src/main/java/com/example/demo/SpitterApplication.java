package com.example.demo;

import com.example.demo.domain.Volunteer;
import com.example.demo.springidol.Performer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpitterApplication.class, args);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol-inject.xml");
		Performer performer = (Performer) ctx.getBean("garry");
		performer.perform();
		Performer poeticPerformer1 = (Performer) ctx.getBean("poeticDuke");
		poeticPerformer1.perform();

		Volunteer volunteer = (Volunteer) ctx.getBean("volunteer");
		volunteer.thinkOfSomething("Quenn of harts");
//		instrumentPerformer.perform();
//		Performer oneManBandPerformer1 = (Performer) ctx.getBean("hank");
//		oneManBandPerformer1.perform();
	}

}

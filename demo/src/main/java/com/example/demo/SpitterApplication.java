package com.example.demo;

import com.example.demo.springidol.Performer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpitterApplication.class, args);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		Performer performer = (Performer) ctx.getBean("duke");
		performer.perform();
		Performer poeticPerformer1 = (Performer) ctx.getBean("poeticDuke");
		poeticPerformer1.perform();
		Performer instrumentPerformer = (Performer) ctx.getBean("kenny");
		instrumentPerformer.perform();
		Performer multyPerformer = (Performer) ctx.getBean("hank");
		multyPerformer.perform();
	}

}

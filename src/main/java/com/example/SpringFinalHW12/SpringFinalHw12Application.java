package com.example.SpringFinalHW12;

import com.example.SpringFinalHW12.service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication


public class SpringFinalHw12Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TaskService taskService = context.getBean(TaskService.class);
		taskService.createAndExecuteTask("urgent");
		taskService.createAndExecuteTask("regular");

		context.close();
	}
}
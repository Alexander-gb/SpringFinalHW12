package com.example.SpringFinalHW12;

import com.example.SpringFinalHW12.service.TaskService;
import com.example.SpringFinalHW12.task.TaskFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    @Bean
    public TaskService taskService() {
        return TaskService.getInstance();
    }

    @Bean
    public TaskFactory taskFactory() {
        return new TaskFactory();
    }
}
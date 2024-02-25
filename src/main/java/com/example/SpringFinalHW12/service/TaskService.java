package com.example.SpringFinalHW12.service;


import com.example.SpringFinalHW12.task.Task;
import com.example.SpringFinalHW12.task.TaskFactory;

public class TaskService {
    private static final TaskService instance = new TaskService();
    private TaskFactory taskFactory = new TaskFactory();

    private TaskService() {}

    public static TaskService getInstance() {
        return instance;
    }

    public void createAndExecuteTask(String type) {
        Task task = taskFactory.createTask(type);
        task.execute();
    }
}
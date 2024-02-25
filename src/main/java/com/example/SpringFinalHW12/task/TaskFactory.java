package com.example.SpringFinalHW12.task;

public class TaskFactory {
    public Task createTask(String type) {
        if ("urgent".equalsIgnoreCase(type)) {
            return new UrgentTask();
        } else if ("regular".equalsIgnoreCase(type)) {
            return new RegularTask();
        } else {
            throw new IllegalArgumentException("Unknown task type");
        }
    }
//switch
}
package com.example.SpringFinalHW12.task;

public class UrgentTask implements Task {
    @Override
    public void execute() {
        System.out.println("Executing urgent task");
    }
}

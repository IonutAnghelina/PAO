package com.company.classes;

import com.company.interfaces.*;

public class RandomTask implements Task {

    private String message;

    public RandomTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}

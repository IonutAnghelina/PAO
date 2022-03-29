package com.company.classes;

import com.company.interfaces.Task;

import java.util.ArrayList;

public class Container {

    ArrayList<Task> tasks;


    public Container() {
        tasks = new ArrayList<Task>();
    }

    public void add(Task t) {
        tasks.add(t);
    }


    public void remove(Task t) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(t)) {
                tasks.remove(i);
                return;
            }
        }
    }
}

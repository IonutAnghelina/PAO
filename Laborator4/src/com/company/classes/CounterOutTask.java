package com.company.classes;

import com.company.interfaces.Task;

public class CounterOutTask implements Task {

    private static int counter = 0;


    @Override
    public void execute() {
        counter++;
        System.out.print("Valoarea curenta a counterului este ");
        System.out.println(counter);
    }
}

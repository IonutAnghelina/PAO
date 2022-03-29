package com.company.classes;

import com.company.interfaces.*;

import java.util.Random;

public class OutTask implements Task {

    private int randomNumber;

    public OutTask() {
        Random rand = new Random();

        randomNumber = rand.nextInt(10000);
    }

    @Override
    public void execute() {

        System.out.print("Numarul aleatoriu generat este: ");
        System.out.println(randomNumber);
    }
}

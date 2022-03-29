package com.company.classes;

import com.company.interfaces.*;

public class Operation implements Minus, Plus, Mult, Div {

    private float term;

    public Operation(float term) {
        this.term = term;
    }

    public float getTerm() {
        return term;
    }

    public void setTerm(float term) {
        this.term = term;
    }

    @Override
    public void divide(float value) {

        if (value == 0) {

            System.out.println("You cannot divide by 0!");
            return;

        }

        term /= value;
    }

    @Override
    public void substract(float value) {

        term -= value;
    }

    @Override
    public void multiply(float value) {
        term *= value;
    }

    @Override
    public void add(float value) {
        term += value;
    }
}

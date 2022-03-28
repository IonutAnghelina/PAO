package com.company.classes;

public class Singleton {

    private static Singleton single_instance = null;

    public String s;

    private Singleton(String s) {
        this.s = s;
    }

    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton("something");

        return single_instance;
    }
}

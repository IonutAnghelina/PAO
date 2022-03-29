package com.company.classes;

import java.util.Random;

public class PasswordMaker {

    static PasswordMaker instance = null;

    final int MAGIC_NUMBER = 11;

    final String MAGIC_STRING = getRandomString(20);

    String name;


    public static PasswordMaker getInstance(String str) {
        if (instance == null)
            instance = new PasswordMaker(str);
        return instance;
    }

    private PasswordMaker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getRandomString(int length) {
        Random random = new Random();

        String str = "";

        for (int i = 0; i < length; i++) {
            int value = random.nextInt(122 - 97) + 97;

            str = str + (char) value;
        }

        return str;
    }

    public String getPassword() {
        String str1 = getRandomString(MAGIC_NUMBER);

        for (int i = 0; i < 10; i++) {
            str1 = str1 + MAGIC_STRING.charAt(i);
        }

        str1 = str1 + Integer.toString(name.length());

        Random random = new Random();
        int value = random.nextInt(100);

        str1 = str1 + Integer.toString(value);

        return str1;
    }
}

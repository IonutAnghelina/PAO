package com.company;

import com.company.classes.Person;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();

        Person p2 = new Person("Ionut","Anghelina",20,-1,"Person");


        System.out.print(p1.getAge());
        System.out.print(" ");
        System.out.println(p1.getIdNumber());
        System.out.print(p2.getName());
        System.out.print(" ");
        System.out.println(p2.getSurname());

    }
}

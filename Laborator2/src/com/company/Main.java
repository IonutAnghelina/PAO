package com.company;

import com.company.classes.Person;
import com.company.classes.Room;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();

        Person p2 = new Person("Ionut","Anghelina",20,-1,"Person");


        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Room r1 = new Room(1,"Apartment",2);
        Room r2 = new Room(2,"Presidential Apartment",6);

        System.out.println(r1.toString());

        System.out.println(r2.toString());
    }
}

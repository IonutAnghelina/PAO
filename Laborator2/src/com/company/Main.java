package com.company;

import com.company.classes.Person;
import com.company.classes.Room;
import com.company.classes.Singleton;
import com.company.classes.Subject;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("John","Doe",55,-2,"Person");

        Person p2 = new Person("Ionut","Anghelina",20,-1,"Person");


        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Room r1 = new Room(1,"Apartment",2);
        Room r2 = new Room(2,"Presidential Apartment",6);

        System.out.println(r1.toString());

        System.out.println(r2.toString());

        Subject s1 = new Subject(r1,15,p1);
        Subject s2 = new Subject(r2,20,p2);

        System.out.println(s1);
        System.out.println(s2);

        Singleton sing1;

        
    }
}

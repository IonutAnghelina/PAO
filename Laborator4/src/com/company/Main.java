package com.company;

import com.company.classes.*;
import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        RandomTask t1 = new RandomTask("ceva");

        t1.execute();

        OutTask t2 = new OutTask();

        t2.execute();

        CounterOutTask t3 = new CounterOutTask();

        t3.execute();

        t3.execute();

        t3.execute();

        Container c1 = new Container();

        c1.add(t1);
        c1.add(t2);

        c1.remove(t1);

        Operation op = new Operation(1);

        op.add(1);

        System.out.println(op.getTerm());

        op.substract(1);

        System.out.println(op.getTerm());

        op.multiply(10);

        System.out.println(op.getTerm());

        op.divide(2);

        System.out.println(op.getTerm());

        op.divide(0);

        System.out.println(op.getTerm());

        Album a1 = new Album("a", "b", 4.2, 1995);
        Album a2 = new Album("c", "d", 5, 2005);

        ArrayList<Album> lst = new ArrayList<Album>();

        lst.add(a2);
        lst.add(a1);

        System.out.println("The order of the albums before sorting is:");

        for (int i = 0; i < lst.size(); i++)
            System.out.println(lst.get(i));

        Collections.sort(lst);

        System.out.println("The order of the albums after sorting is:");
        for (int i = 0; i < lst.size(); i++)
            System.out.println(lst.get(i));


    }
}

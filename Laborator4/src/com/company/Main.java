package com.company;

import com.company.classes.*;
import org.w3c.dom.css.Counter;

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
    }
}

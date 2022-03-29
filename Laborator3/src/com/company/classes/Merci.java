package com.company.classes;

import java.util.Objects;

public class Merci extends CandyBox {


    private int length;


    public Merci() {
    }

    public Merci(int length) {
        this.length = length;
    }

    public Merci(String flavor, String origin, int length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " has volume " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Merci merci = (Merci) o;
        return length == merci.length;
    }


}

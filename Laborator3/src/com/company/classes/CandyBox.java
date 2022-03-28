package com.company.classes;

public abstract class CandyBox {


    protected String flavor;
    protected String origin;


    public CandyBox() {
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public abstract double getVolume();

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}

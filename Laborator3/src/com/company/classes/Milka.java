package com.company.classes;

public class Milka extends CandyBox{

    private int radius;
    private int height;


    public Milka() {
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public Milka(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public Milka(String flavor, String origin, int radius, int height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " has volume " + this.getVolume();
    }
}

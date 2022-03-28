package com.company.classes;

public class Lindt extends CandyBox{


    private int length;
    private int width;
    private int height;

    @Override
    public double getVolume() {
        return length * width * height;
    }


    public Lindt() {
    }

    public Lindt(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(String flavor, String origin, int length, int width, int height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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

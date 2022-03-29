package com.company.classes;

public class Area {

    private CandyBag bag;
    private int number;
    private String street;

    public Area() {
    }

    public Area(CandyBag bag, int number, String street) {
        this.bag = bag;
        this.number = number;
        this.street = street;
    }

    public void printAddress()
    {
        System.out.print("The area consist of the street: " + this.street);
        System.out.print(" number: " + this.number);
        System.out.println(" and the following boxes are being sold:");

        for(int i=0;i<this.bag.getBoxes().length;i++)
            System.out.println(this.bag.getBoxes()[i]);
    }
    @Override
    public String toString() {
        return "Area{" +
                "bag=" + bag.toString() +
                ", number=" + number +
                ", street='" + street + '\'' +
                '}';
    }
}

package com.company.classes;

import java.util.Comparator;

public class Album implements Comparable<Album>, Comparator<Album> {

    private String name;
    private String artist;
    private double rating;
    private int year;


    public Album(String name, String artist, double rating, int year) {
        this.name = name;
        this.artist = artist;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public int compareTo(Album o) {

        if (name == o.name && rating == o.rating) return this.year - o.year;

        if (name == o.name) return (int) (rating - o.rating);


        return name.compareTo(o.name);
    }

    @Override
    public int compare(Album o1, Album o2) {

        if (o1.name == o2.name && o1.rating == o2.rating) return o1.year - o2.year;

        if (o1.name == o2.name) return (int) (o1.rating - o2.rating);

        return o1.name.compareTo(o2.name);
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}

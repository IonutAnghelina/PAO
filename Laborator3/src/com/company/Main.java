package com.company;

import com.company.classes.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Milka b1 = new Milka(5, 5);

        CandyBag c1 = new CandyBag();

        CandyBox[] v = new CandyBox[3];

        v[0] = new Milka("Caramel", "Swiss", 5, 5);

        v[1] = new Merci("Almonds", "Belgian", 10);

        v[2] = new Lindt("Oranges", "Brazilian", 1, 2, 3);

        c1.setBoxes(v);

        System.out.println(c1.toString());

        Area a1 = new Area(c1, 10, "Sudului");

        a1.printAddress();


        System.out.println("Enter a string");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String rev = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (rev.equals(str)) {
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is not a palindrome");
        }

        System.out.println("Enter 2 strings");

        String s1 = sc.nextLine();

        String s2 = sc.nextLine();

        int[] l1 = new int[100];
        int[] l2 = new int[100];

        for (int i = 0; i < s1.length(); i++) {
            l1[i] = s1.charAt(i);
        }

        for (int i = 0; i < s2.length(); i++) {
            l2[i] = s2.charAt(i);
        }

        if (l1.length != l2.length)
            System.out.println("The 2 strings are not anagrams");
        else {

            Arrays.sort(l1);
            Arrays.sort(l2);

            boolean flag = true;

            for (int i = 0; i < l1.length; i++) {
                if (l1[i] != l2[i]) {
                    System.out.println("The 2 strings are not anagrams");
                    flag = false;
                    break;
                }
            }

            if (flag == true)
                System.out.println("The 2 strings are anagrams");
        }

        PasswordMaker p1 = PasswordMaker.getInstance("Ionut");


        System.out.println("The generated password is:");
        System.out.println(p1.getPassword());
    }
}

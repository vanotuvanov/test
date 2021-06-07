package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> empSpisok = new ArrayList<Animal>();
        empSpisok.add(new Cockroach("жив", "рыжий", 5, 2));
        empSpisok.add(new Cockroach("не жив", "черный", 1, 1));
        empSpisok.add(new Butterflies("жив", 3, 6, 2));
        for (Animal emp : empSpisok) {
            emp.getInfo();
            System.out.println();
        }
    }
}


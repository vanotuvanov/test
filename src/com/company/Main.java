package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {

        ArrayList<Animal> empSpisok = new ArrayList<Animal>();//создание списка и наполнение его

        empSpisok.add(new Cockroach("жив", "рыжий", 5, 2));
        empSpisok.add(new Cockroach("не жив", "черный", 1, 1));
        empSpisok.add(new Butterflies("жив", 3, 6, 2));

        for (Animal emp : empSpisok)//вывод списка через цикл
        {
            System.out.println(emp.getInfo());//чтобы каждый новый элемент с новой строки
        }
    }
}


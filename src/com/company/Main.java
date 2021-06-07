package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Animal> empSpisok = new ArrayList<Animal>();//создание списка и наполнение его
        empSpisok.add(new Cockroach("жив", "рыжий", 5, 2));
        empSpisok.add(new Cockroach("не жив", "черный", 1, 1));
        empSpisok.add(new Butterflies("жив", 3, 6, 2));
        for (Animal emp : empSpisok)//вывод списка через цикл
        {
            emp.getInfo();//вызов для получении информации об элементе
            System.out.println();//чтобы каждый новый элемент с новой строки
        }
    }
}


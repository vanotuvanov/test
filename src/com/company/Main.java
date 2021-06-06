package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Cockroach green = new Cockroach();
        green.setPaws(6);
        green.setUsi(1);
        String s="рыжий";
        green.setColors(s);
        System.out.println("Надеюсь сработает и покажет кол-во лапок и усов, а также ебучий цвет - " + green.getPaws() +" "+ green.getUsi()+ " "+ green.getColors());
    }
}
class Animal {
}
class Bug extends Animal
{
    private int Paws;//кол-во лапок
    private int Usi;//кол-во усов
    public int getPaws()
    {
      return Paws;
    }
    public void setPaws(int paws)
    {
        if (paws>=0 & paws<=6)//проверка на кол-во
        {
            this.Paws=paws;
        }
    }
    public int getUsi()
    {
        return Usi;
    }
    public void setUsi(int usi)
    {
        if (usi>=0 & usi<=2)//проверка на кол-во
        {
            this.Usi=usi;
        }
    }
}
class Cockroach extends Bug//таракан
{
    private String Colors; //цвет таракана
    public String getColors()
    {
        return Colors;
    }
    public void setColors(String colors)
    {
        if (colors=="черный" | colors=="рыжий" | colors=="белый")
        {
            this.Colors=colors;
        }
        else System.out.println("Зачем ты красишь тараканов?");
    }
}
class Butterflies extends Bug//бабочки
{

}
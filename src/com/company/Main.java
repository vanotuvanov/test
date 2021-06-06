package com.company;

public class Main {

    public static void main(String[] args)
    {
       // String s="рыжий";
        Cockroach first = new Cockroach("рыжий",5,2);
        Butterflies third = new Butterflies(3,6,2);
        first.getInfo();
        third.getInfo();
       // System.out.println("Надеюсь сработает и покажет кол-во лапок и усов, а также ебучий цвет - " + first.getPaws() +" "+ first.getUsi()+ " "+ first.getColors());
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
    public Cockroach () {}
    public Cockroach (String Colors,int x,int y)//конструктор с параметрами
    {
        setColors(Colors);
        setPaws(x);
        setUsi(y);
    }
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
    public void getInfo()
    {
        System.out.println("Это таракан, который имеет "+ getColors() +" цвет, "+getPaws()+ " лапок и "+getUsi()+" уса");
    }
}
class Butterflies extends Bug//бабочки
{
    public Butterflies (){}
    public Butterflies (int x, int y,int z)//конструктор с параметрами
    {
        setTimeLife(x);
        setPaws(y);
        setUsi(z);
    }
    private int TL;//время жизни в месяцах
    public int getTL()
    {
        return TL;
    }
    public void setTimeLife(int time)
    {
        if (time>=1 & time<=8)
        {
            this.TL=time;
        }
    }
    public void getInfo()
    {
        System.out.println("Это бабочка, у которой "+ getPaws() +" лапок, "+getUsi()+" уса и она проживет "+ getTL()+ " месяц(а/ев)");
    }
}
package com.company;

public class Main {

    public static void main(String[] args)
    {
        Cockroach first= new Cockroach("жив","рыжий",5,2);
        Cockroach second = new Cockroach("не жив","черный",1,1);
        Butterflies third = new Butterflies("жив",3,6,2);
        first.getInfo();
        second.getInfo();
        third.getInfo();
    }
}
class Animal
{
    private String Live;//состояние, живой или нет
    public String getLive()
    {
        return Live;
    }
    public void setLive(String live)
    {
        if (live=="жив"|live=="не жив")
        {
            this.Live=live;
        }
    }
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
    public Cockroach (String live,String Colors,int x,int y)//конструктор с параметрами
    {
        setLive(live);
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
        System.out.println("Это "+ getLive() +" таракан, который имеет "+ getColors() +" цвет, "+getPaws()+ " лапок и "+getUsi()+" уса");
    }
}
class Butterflies extends Bug//бабочки
{
    public Butterflies (){}
    public Butterflies (String live,int x, int y,int z)//конструктор с параметрами
    {
        setLive(live);
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
        System.out.println("Это "+getLive()+" бабочка, у которой "+ getPaws() +" лапок, "+getUsi()+" уса и она проживет "+ getTL()+ " месяц(а/ев)");
    }
}
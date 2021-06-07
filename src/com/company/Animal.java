package com.company;

class Animal {
    private String Live;

    public Animal() {
    }

    public Animal(String live)
    {
        this.Live = live;
    }

    public String getLive()
    {
        return this.Live;
    }

    public void setLive(String live) {
        if (live == "жив" | live == "не жив")
        {
            this.Live = live;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Live='" + Live + '\'' +
                '}';
    }

    public String getInfo() {
        return toString();
    }
}
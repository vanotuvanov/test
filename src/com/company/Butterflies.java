package com.company;

class Butterflies extends Bug {

    private int TL;

    public Butterflies() {
    }

    public Butterflies(String live, int time, int paws, int usi) {
        super(live, paws, usi);
        this.TL = time;
    }

    public int getTL() {
        return this.TL;
    }

    public void setTimeLife(int time) {
        if (time >= 1 & time <= 8) {
            this.TL = time;
        }

    }

    @Override
    public String toString() {
        return "Butterflies{" +
                "TL=" + TL +
                '}';
    }

     public String getInfo() {
        String s=super.getInfo()+" "+this.TL;
        return s;
    }
}
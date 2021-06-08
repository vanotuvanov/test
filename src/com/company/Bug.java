package com.company;

class Bug extends Animal {

    private int Paws;
    private int Usi;

    public Bug() {
    }

    public Bug(String live, int paws, int usi)
    {
        super(live);
        this.Paws = paws;
        this.Usi = usi;
    }

    public int getPaws() {
        return this.Paws;
    }

    public void setPaws(int paws) {
        if (paws >= 0 & paws <= 6) {
            this.Paws = paws;
        }
    }

    public int getUsi() {
        return this.Usi;
    }

    public void setUsi(int usi) {
        if (usi >= 0 & usi <= 2) {
            this.Usi = usi;
        }
    }

    @Override
    public String toString(){
        return "Bug{" +
                "Paws=" + Paws +
                ", Usi=" + Usi +
                '}';
    }

    public String getInfo() {
        String s;
        s=super.getInfo()+" "+this.Paws+" "+this.Usi;
        return s;
    }
}
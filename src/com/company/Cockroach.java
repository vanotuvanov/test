package com.company;

class Cockroach extends Bug {
    private String Colors;

    public Cockroach() {
    }

    public Cockroach(String live, String colors, int paws, int usi) {
        super(live, paws, usi);
        this.Colors = colors;
    }

    public String getColors() {
        return this.Colors;
    }

    public void setColors(String colors) {
        if (colors == "черный" | colors == "рыжий" | colors == "белый") {
            this.Colors = colors;
        } else {
            System.out.println("Зачем ты красишь тараканов?");
        }

    }

    public void getInfo() {
        super.getInfo();
        System.out.print(this.Colors.toString());
    }
}
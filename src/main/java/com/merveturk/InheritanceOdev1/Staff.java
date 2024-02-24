package com.merveturk.InheritanceOdev1;
public abstract  class Staff {


    private String name;
    private int yas;
    public abstract boolean isAlive();
    public void info(){
        System.out.println("Staff abstract class");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

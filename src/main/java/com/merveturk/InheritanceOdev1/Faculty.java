package com.merveturk.InheritanceOdev1;

public class Faculty extends Staff{

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public void info(){
        System.out.println("Faculty Class ");
    }


}

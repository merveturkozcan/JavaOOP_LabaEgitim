package com.merveturk.InheritanceOdev1;

public class AdministrativeStaff extends Staff{

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void info(){
        System.out.println("AdministrativeStaff Class ");
    }

}

package com.merveturk.ders2Polimorphizm;

public class Engineer extends Employee{

    public void infoDepartmentAndLocation(String info){
        System.out.println(info);}

    @Override
    public int calculateEmployeeSalary() {
        int salary= super.calculateEmployeeSalary();
        salary+= salary*30/100;
        return salary;

    }
}

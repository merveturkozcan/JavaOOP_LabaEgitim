package com.merveturk.ders2Polimorphizm;

public abstract class Employee implements BenefitCompany {

    private int tckn;
    private String name;
    private final int CONSTANT = 500;
    private int totalWorkingYears;


    public void workStyle() {
        System.out.println("Employee Class working...");
    }

    public int calculateEmployeeSalary() {
        int salary = totalWorkingYears * this.CONSTANT;
        return salary;
    }

    public int getTckn() {
        return tckn;
    }

    public void setTckn(int tckn) {
        this.tckn = tckn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalWorkingYears() {
        return totalWorkingYears;
    }

    public void setTotalWorkingYears(int totalWorkingYears) {
        this.totalWorkingYears = totalWorkingYears;
    }


}

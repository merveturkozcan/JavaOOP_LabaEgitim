package com.merveturk.ders2Polimorphizm;

public class Manager extends Employee{

    private int floorNumber;
    private final int salaryMultiplier=1500;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public void workStyle() {
        super.workStyle();
        System.out.println("Manager manages this class.");
    }

    public int calculateEmployeeSalary() {
        int salary = salaryMultiplier * getTotalWorkingYears();
        return salary;
    }








}

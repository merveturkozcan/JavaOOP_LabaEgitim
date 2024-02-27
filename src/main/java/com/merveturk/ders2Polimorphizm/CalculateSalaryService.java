package com.merveturk.ders2Polimorphizm;

public class CalculateSalaryService {


//    public void calculateSalary(Engineer engineer) {
//        engineer.setTotalWorkingYears(5);
//        int salary = engineer.calculateEmployeeSalary();
//        System.out.println("Engineer Salary: " + salary);
//    }
//
//    public void calculateSalary(Manager manager) {
//        manager.setTotalWorkingYears(3);
//        int salary = manager.calculateEmployeeSalary();
//        System.out.println("Manager Salary: " + salary);
//    }
    // yukarısı polimofik olmayan yapı

    //*************************************

    public void calculateSalary(Employee employee) {
        employee.setTotalWorkingYears(3);
        int salary = employee.calculateEmployeeSalary();
        System.out.println("Salary: " + salary);
    }


}

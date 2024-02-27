package com.merveturk.ders2Polimorphizm;

public class Test {
    public static void main(String[] args) {

        CalculateSalaryService calculateSalaryService = new CalculateSalaryService();

       /* Manager manager = new Manager();
        manager.setTotalWorkingYears(3);
        calculateSalaryService.calculateSalary(manager);

        Engineer engineer = new Engineer();
        engineer.setTotalWorkingYears(5);
        */

        //************* yukarısı polimofik olmayan yapı  **************

        Employee engineer = new Engineer();
        calculateSalaryService.calculateSalary(engineer);

        Employee manager = new Manager();
        calculateSalaryService.calculateSalary(manager);


    }
}

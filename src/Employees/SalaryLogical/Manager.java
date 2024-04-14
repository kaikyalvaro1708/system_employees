package Employees.SalaryLogical;

import Employees.Employee;

public class Manager extends Employee {
    private double baseSalary;
    private double performanceBonus;

    public Manager(String name, int age, double salary, double baseSalary, double performanceBonus) {
        super(name, age, salary);
        this.baseSalary = baseSalary;
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + performanceBonus;
    }

    // Specific Getters and Setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getPerformanceBonus() {
        return performanceBonus;
    }

    public void setPerformanceBonus(double performanceBonus) {
        this.performanceBonus = performanceBonus;
    }

    public String getName() {
        return super.getName();
    }
}

package Employees.SalaryLogical;

import Employees.Employee;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int age, double salary){
        super(name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary();
    }
}

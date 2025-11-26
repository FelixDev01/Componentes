package service;

public class Employee {

    String name;

    double grossSalary;

    public Employee() {
    }

    public Employee(Double grossSalary, String name) {
        this.grossSalary = grossSalary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }
}

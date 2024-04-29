package Polymorphism;

public class PartTimeEmp extends Employee{

    public PartTimeEmp(int employeeId, String name, String department, double salary) {
        super(employeeId, name, department, salary);
    }

    @Override
    double netSalary(double baseSalary) {
        double allowance = 0.20* baseSalary;
        double grossSalary = allowance+ baseSalary;
        double deduction = 0.15* grossSalary;
        return grossSalary - deduction;
    }

    @Override
    void employeeInfo() {
        super.employeeInfo();
        System.out.println(name + " is a part time employee.");
    }
}

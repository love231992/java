package Polymorphism;

class FullTimeEmp extends Employee {

    public FullTimeEmp(int employeeId, String name, String department, double salary) {
        super(employeeId, name, department, salary);
    }

    @Override
    double netSalary(double baseSalary) {
        double allowance = 0.30* baseSalary;
        double grossSalary = allowance+ baseSalary;
        double deduction = 0.15* grossSalary;
        return grossSalary - deduction;
    }

    @Override
    void employeeInfo() {
        super.employeeInfo();
        System.out.println(name + " is a full time employee");
    }
}
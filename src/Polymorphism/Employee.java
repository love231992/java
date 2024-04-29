package Polymorphism;

public class Employee {
    int employeeId;
    String name;
    String department;
    double salary;

    public Employee(int employeeId, String name, String department,double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    double netSalary(double baseSalary){
        double allowance = 0.25* baseSalary;
        double grossSalary = allowance+ baseSalary;
        double deduction = 0.15* grossSalary;
        return grossSalary - deduction;
    }
 void employeeInfo(){
     System.out.println("Employee name is "+name);
     System.out.println(name +" employee id is "+ employeeId);
     System.out.println(name +" department is "+department);
     System.out.println(name +" salary is "+netSalary(salary));


 }


}

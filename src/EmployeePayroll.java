public class EmployeePayroll {
    String empName;
    int empId;
    String designation;
    double salary;

    public EmployeePayroll(String empName, int empId, String designation, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    public double grossSalary(){
        double allowance = 0.25* salary;
        return salary+allowance;
    }

    public double deduction (){
        return grossSalary() *.30;
    }

    public double netSalary() {
        return grossSalary() - deduction();
    }

    public String toString() {
        return "EmployeePayroll{" +
                "Name='" + empName + '\'' +
                ", Id=" + empId +
                ", Designation='" + designation + '\'' +
                ", Basic Salary=$" + salary +
                '}';
    }

    public static void main(String[] args) {
        EmployeePayroll emp = new EmployeePayroll("Arpan Pandit",5278,"Engineer",4500);
        System.out.println(emp);
        System.out.println("Gross salary is $" + emp.grossSalary());
        System.out.println("Net salary is $" + emp.netSalary());
        System.out.println("Deduction is $" + emp.deduction());


    }

}

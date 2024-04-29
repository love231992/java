package Polymorphism;

public class EmployeeMain {
    public static void main(String[] args) {
        FullTimeEmp emp = new FullTimeEmp(20035128,"Lovepreet","QA",5500);
        emp.employeeInfo();
        System.out.println("--------------------------------------------------------------------------------");
        PartTimeEmp emp1 = new PartTimeEmp(20035129,"Ram","Web develpoment",5500);
        emp1.employeeInfo();
    }
}

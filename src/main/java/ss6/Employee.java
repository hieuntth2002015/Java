package ss6;

public class Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;

    void displayEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("=================");
        System.out.println("EmployeeName: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Salary: " + employeeSalary );
        System.out.println("Employee Marital Status: " + maritalStatus);
    }
}

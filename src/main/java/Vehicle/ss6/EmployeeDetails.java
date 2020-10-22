package Vehicle.ss6;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee objEmp = new Employee("E001", "Maria Nemeth", 40000);
        objEmp.calcCommission(20000F);

        objEmp.displayDetails();
    }
}

package lab7.Employees;
import java.util.List;

public class EmployeManagementSystem {
    public static List<Employee> filterEmployeesBySalary(List<Employee> employeeList,double minSalary){
        return employeeList.stream()
                .filter(employee-> employee.salary() ==minSalary)
                .toList();
    }
    public static double calculateTotalSalary(List<Employee> employeeList){
    return employeeList.stream()
            .mapToDouble(Employee::salary)
            .sum();
    }
    public static void displayEmployeeDetails(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee));
    }

    public static void main(String[] args) {
        EmployeManagementSystem system = new EmployeManagementSystem();
        List<Employee> employeeList = List.of(
                new Employee(1, "Ahmed Kedic", 53000.0),
                new Employee(2, "Kedi Sjedi", 74000.0),
                new Employee(3, "Ahmo Sterling", 75000.0)
        );
        List<Employee> filteredEmployees = system.filterEmployeesBySalary(employeeList, 53000.0);
        double totalSalary = system.calculateTotalSalary(employeeList);
        System.out.println("Original Employee List:");
        system.displayEmployeeDetails(employeeList);

        System.out.println("\nEmployees with minimum salary: ");
        system.displayEmployeeDetails(filteredEmployees);

        System.out.println("\nTotal Salary of all employees: " + totalSalary);

    }
}

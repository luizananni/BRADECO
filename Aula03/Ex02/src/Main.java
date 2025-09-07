import service.EmployeeService;
import employee.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        System.out.println("Iniciando...");
        employeeService.createAndSaveEmployee("Luiza Nanni", 50.0, 200.0);
    }
}
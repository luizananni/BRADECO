package service;

import employee.Employee;
import persistence.EmployeeDataStore;

public class EmployeeService {

    private EmployeeDataStore dataStore;

    public EmployeeService() {
        this.dataStore = new EmployeeDataStore();
    }

    public void createAndSaveEmployee(String name, double hourlyRate, double hoursWorked) {
        Employee employee = new Employee(name, hourlyRate, hoursWorked);
        dataStore.save(employee);
    }
}
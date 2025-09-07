package persistence;

import employee.Employee;

public class EmployeeDataStore {

    public void save(Employee employee) {
        System.out.println("________________________________");
        System.out.println("Simulando a persistência de dados...");
        System.out.println("Funcionário: " + employee.getName());
        System.out.println("Salário calculado R$" + employee.calculatePay());
        System.out.println("Dados salvos com sucesso! ");
        System.out.println("________________________________");
    }
}
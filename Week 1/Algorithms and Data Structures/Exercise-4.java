public class Employee 
{
    private int employeeId;
    private String name;
    private String position;
    private double salary;
}

public class EmployeeManagementSystem 
{
    private Employee[] employees;
    private int numEmployees;

    public EmployeeManagementSystem(int capacity) 
    {
        employees = new Employee[capacity];
        numEmployees = 0;
    }

    // Add an employee
    public void addEmployee(Employee emp) 
    {
        if (numEmployees < employees.length) 
        {
            employees[numEmployees] = emp;
            numEmployees++;
        } 
        else 
        {
            System.out.println("Employee database is full.");
        }
    }

    // Search for an employee by ID
    public Employee findEmployeeById(int empId) 
    {
        for (Employee emp : employees) 
        {
            if (emp != null && emp.getEmployeeId() == empId) 
            {
                return emp;
            }
        }
        return null; // Employee not found
    }

    // Traverse all employees
    public void displayAllEmployees() 
    {
        for (Employee emp : employees) 
        {
            if (emp != null) 
            {
                System.out.println(emp.getName() + " (" + emp.getPosition() + ")");
            }
        }
    }

    // Delete an employee by ID
    public void deleteEmployee(int empId) 
    {
        for (int i = 0; i < numEmployees; i++) 
        {
            if (employees[i] != null && employees[i].getEmployeeId() == empId) 
            {
                for (int j = i; j < numEmployees - 1; j++) 
                {
                    employees[j] = employees[j + 1];
                }
                employees[numEmployees - 1] = null;
                numEmployees--;
                System.out.println("Employee with ID " + empId + " deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + empId + " not found.");
    }
}

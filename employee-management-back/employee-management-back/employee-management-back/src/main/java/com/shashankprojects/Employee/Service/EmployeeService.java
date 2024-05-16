package com.shashankprojects.Employee.Service;

import com.shashankprojects.Employee.Model.Employee;

import java.util.List;

public interface EmployeeService {
      Employee createEmployee(Employee employee);

      List<Employee> getEmployees();


      boolean deleteEmployee(long id);

      Employee getEmployeeById(long id);

      Employee updateEmployee(Long id, Employee employee);
}

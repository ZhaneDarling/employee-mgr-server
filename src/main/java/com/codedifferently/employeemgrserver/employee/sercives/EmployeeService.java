package com.codedifferently.employeemgrserver.employee.sercives;

import com.codedifferently.employeemgrserver.domain.core.exceptions.ResourceCreationException;
import com.codedifferently.employeemgrserver.domain.core.exceptions.ResourceNotFoundException;
import com.codedifferently.employeemgrserver.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(Employee employee) throws ResourceCreationException;
    Employee getById(long id) throws ResourceNotFoundException;
    Employee getByEmail(String email) throws ResourceNotFoundException;
    List<Employee> getAll();
    Employee update(long id, Employee employeeDetail) throws ResourceNotFoundException;
    void delete(long id);
}

package fawry.task.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import fawry.task.demo.models.Employee;

public interface EmployeeService {
    List<Employee> getAll();
    Optional<Employee> getById(UUID id);
    Employee create(Employee employee);
    Optional<Employee> update(UUID id, Employee updated);
    boolean delete(UUID id);
}

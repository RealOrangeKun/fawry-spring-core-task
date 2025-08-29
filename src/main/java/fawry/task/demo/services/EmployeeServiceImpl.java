package fawry.task.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import fawry.task.demo.models.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<UUID, Employee> employees = new HashMap<>();

    @Override
    public List<Employee> getAll() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public Optional<Employee> getById(UUID id) {
        return Optional.ofNullable(employees.get(id));
    }

    @Override
    public Employee create(Employee employee) {
        employees.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public Optional<Employee> update(UUID id, Employee updated) {
        if (employees.containsKey(id)) {
            employees.put(id, updated);
            return Optional.of(updated);
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(UUID id) {
        return employees.remove(id) != null;
    }
}

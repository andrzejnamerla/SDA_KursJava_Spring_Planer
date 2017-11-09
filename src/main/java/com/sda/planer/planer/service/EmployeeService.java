package com.sda.planer.planer.service;

import com.sda.planer.planer.model.Employee;
import com.sda.planer.planer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee get(Long id){
        return employeeRepository.findOne(id);
    }

    public List<Employee> getAll(){
        return StreamSupport.stream(employeeRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }
}

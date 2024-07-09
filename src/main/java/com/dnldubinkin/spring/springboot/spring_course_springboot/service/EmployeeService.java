package com.dnldubinkin.spring.springboot.spring_course_springboot.service;



import com.dnldubinkin.spring.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployee(int id);

    public void saveUpdateEmployee(Employee employee);
    public void deleteEmployee(int id);

}

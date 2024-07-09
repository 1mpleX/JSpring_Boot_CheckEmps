package com.dnldubinkin.spring.springboot.spring_course_springboot.dao;



import com.dnldubinkin.spring.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee getEmployee(int id);

    public void saveUpdateEmployee(Employee employee);
    public void deleteEmployee(int id);
}

package com.example.EmployeeRegistration.Controller;

import com.example.EmployeeRegistration.Entity.Employee;
import com.example.EmployeeRegistration.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/getName")
    public Collection<Employee> getEmployee()
    {
      return  this.employeeService.getEmployee();
    }
    @GetMapping("/get/{id}")
    public  Employee getEmployeeById(@PathVariable(name="id")int id)
    {
        return this.employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Employee deleteEmployeeById(@PathVariable(name="id") int id)
    {
        return this.employeeService.deleteEmployeeById(id);
    }

}

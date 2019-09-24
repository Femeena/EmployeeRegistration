package com.example.EmployeeRegistration.Service;


import com.example.EmployeeRegistration.Dao.EmployeeDao;
import com.example.EmployeeRegistration.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class EmployeeService {
@Autowired
    EmployeeDao employeeDao;
    public Collection<Employee> getEmployee()
    {
       return this.employeeDao.getEmployee();
    }
    public  Employee getEmployeeById(int id)
    {
        return this.employeeDao.getEmployeeById(id);
    }
    public Employee deleteEmployeeById(int id)
    {
        return this.employeeDao.deleteEmployeeById(id);
    }

}

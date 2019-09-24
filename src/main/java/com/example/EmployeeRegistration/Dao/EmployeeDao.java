package com.example.EmployeeRegistration.Dao;

import com.example.EmployeeRegistration.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
  private static  HashMap<Integer, Employee> emp;
    static
    {
        emp=new HashMap<Integer, Employee>()
        {
            {
                put(1,new Employee(1,"Amal","Java Developer"));
                put(2,new Employee(2,"Rahul",".Net Developer"));
                put(3,new Employee(3,"Akhil","Python Developer"));

            }

        };

}
public  Employee getEmployeeById(int id)
{
    return this.emp.get(id);
}
public Employee deleteEmployeeById(int id)
{
    return this.emp.remove(id);
}

public Collection<Employee> getEmployee()
{
  return  this.emp.values();
}
}

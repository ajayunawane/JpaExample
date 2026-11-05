package com.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepository eresp;
    public Employee addemployee(Employee e)
    {
        eresp.save(e);
        return  e;
    }
}

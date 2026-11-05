package com.Controller;

import com.Service.EmployeeService;
import com.entity.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @PostMapping("/addemp")
    public Employee addemp (@Valid @RequestBody Employee e)
    {
        return service.addemployee(e);
    }
}

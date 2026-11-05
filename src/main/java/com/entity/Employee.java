package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Employee {
    @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
    int empid;
    @NotNull(message = "Name must not be null")
    String name;
    @NotBlank(message = "Department must not ne blank")
    String department;
    String designation;
    @Min(value=18,message = "age must be at least 18 year")
    int age;
    @Positive(message = "Salary must be greater than 0")
    double salary;
    @NotEmpty(message = "Email must not be empty")
    String email;
//    @Size(min=10,max=10,message ="find not your no" )
    @Pattern(regexp = "^[0-9]{10}$",message = "Enter a 10 number")
    String concatno;

    public Employee() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConcatno() {
        return concatno;
    }

    public void setConcatno(String concatno) {
        this.concatno = concatno;
    }
}

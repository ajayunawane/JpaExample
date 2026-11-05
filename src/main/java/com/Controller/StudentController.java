package com.Controller;

import com.Service.StudentService;
import com.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("/addstud")
    public String addst(@RequestBody Student s)
    {
        return service.addstudent(s);
    }
    @PostMapping("/addstudlist")
    public String addstudlist(@RequestBody List<Student> studentList)
    {
        return service.addstudentlist(studentList);
    }
    @GetMapping("getstudentlist")
    public List<Student>findallstudent()
    {
       return  service.findallstudent();
    }
    @GetMapping("/getallrollno")
    public Student getallrollno(@RequestParam int rollno)
    {
        return service.findbyrollno(rollno);
    }
    @DeleteMapping("/deletebyrollno")
    public String deletes(@RequestParam int rollno)
    {
        return service.deletebyrollno(rollno);
    }
    @GetMapping("/count")
    public String countrecord()
    {
        return service.counterecord();
    }
    @PatchMapping("/updatebyrollno")
    public String updatestud(@RequestParam int rollno , @RequestBody Student newstud)
    {
        return service.updaterollno(rollno,newstud);
    }
}

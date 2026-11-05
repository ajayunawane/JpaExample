package com.Service;

import com.entity.Student;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository sresp;
    public String addstudent(Student s)
    {
        sresp.save(s);
        return "Student record added";
    }
    public String addstudentlist(List<Student> studentList)
    {
        sresp.saveAll(studentList);
        return "Student list Addeed Successfully";
    }
    public List<Student>findallstudent()
    {
        return sresp.findAll();
    }
    public Student findbyrollno(int rollno)
    {
        return sresp.findById(rollno) .orElse(null);
    }
    public String deletebyrollno(int rollno)
    {
        if(sresp.existsById(rollno))
        {
            sresp.deleteById(rollno);
            return "Student record deleted successfully";
        }
        else {
            return "No matching data found";
        }
    }
    public String counterecord()
    {
        return "No of records in table are:-"+sresp.count();
    }
    public String updaterollno(int rollno,Student newstud) {
        Student existingstud = sresp.findById(rollno).orElse(null);
        if (existingstud == null) {
            return "No matching record found for giving rollno";

        }
        if(newstud.getName() == null && newstud.getMarks() == 0.0 && newstud.getCourse()== null) {
                return "No new data provide for updation";
        }
        if(newstud.getName() != null)
        {
            existingstud.setName(newstud.getName());
        }
        if(newstud.getCourse() != null)
        {
            existingstud.setCourse(newstud.getCourse());
        }
        if(newstud.getMarks() != 0.0)
        {
            existingstud.setMarks(newstud.getMarks());
        }
        sresp.save(existingstud);
        return "Update record successfully";
    }

}

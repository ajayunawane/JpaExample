package com.Controller;

import com.Service.TrainerService;
import com.entity.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainerController {
    @Autowired
    TrainerService service;
        @PostMapping("/addtrainerlist")
    public String addlist(@RequestBody List<Trainer> trainerList)
    {
        return service.addtrainerlist(trainerList);

    }
        @GetMapping("/Findbyname")
    public List<Trainer>findname(@RequestParam String tname)
    {
        return service.findbytname(tname);
    }
    @GetMapping("/findsalary")
    public List<Trainer>findbysalarygt(@RequestParam double salary)
    {
        return service.findbySalary(salary);
    }
    @GetMapping("/findsalry")
    public List<Trainer>findsalary(@RequestParam double salary)
    {
        return service.findBysalary(salary);
    }
    @GetMapping("/findexp")
    public List<Trainer>findexp(@RequestParam double exp)
    {
        return service.findbyexp(exp);
    }
    @GetMapping("/findbybetween")
    public List<Trainer>findbetween(@RequestParam double minsalary,@RequestParam double maxsalary)
    {
        return service.findBySalarybetween(minsalary, maxsalary);
    }
    @GetMapping("/fingstaringname")
    public List<Trainer>find(@RequestParam String ch)
    {
        return service.findbyname(ch);
    }
    @GetMapping("/findallsort")
    public List<Trainer>findallsort()
    {
        return service.findallbysalaryasc();
    }
    @GetMapping("/findByasc")
    public  List<Trainer>findBySalaryGreaterThanOrderByTnameAsc(@RequestParam double salary)
    {
        return service.findBySalaryGreaterThanOrderByTnameAsc(salary);
    }
//    @GetMapping("/findexpGreate")
//    public List<Trainer>findExpGreater(@RequestParam double exp)
//    {
//        return service.findbyExpGreate(exp);
//    }
//    @GetMapping("/findexpLess")
//    public List<Trainer>findExpLess(@RequestParam double exp)
//    {
//        return service.findbyExpLess(exp);
//    }
//    @GetMapping("/groupbydesc")
//    public List<Trainer>groupbydesc(@RequestParam String tname)
//    {
//        return service.findAllByOrderByTnameDesc(tname);
//    }
    public List<Trainer>SubjectEndingWith(@RequestParam String subject)
    {
        return service.findBySubjectEndingWith(subject);
    }
    @GetMapping("/highSalry")
    public Trainer findsalary()
    {
        return service.findbysalary();
    }
    @GetMapping("/highSalryasc")
    public Trainer findsalaryasc()
    {
        return service.findbysalaryAsc();
    }
    @GetMapping("/findand")
    public List<Trainer>find(@RequestParam int tid,@RequestParam double exp)
    {
        return service.findand(tid,exp);
    }
    @GetMapping("/findexpandsalary")
    public List<Trainer>findexp(@RequestParam double exp,@RequestParam double salary)
    {
        return service.findbyexpandsalary(exp,salary);
    }

}

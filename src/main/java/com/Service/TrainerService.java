package com.Service;

import com.entity.Trainer;
import com.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {
    @Autowired
    TrainerRepository trap;
    public String addtrainerlist(List<Trainer>trainerList)
    {
        trap.saveAll(trainerList);
        return "Trainer list added";
    }
    public List<Trainer>findbytname(String tname)
    {
        return trap.findByTname(tname);
    }
    public List<Trainer>findbySalary(double salary)
    {
        return trap.findBySalaryGreaterThan(salary);
    }
    public List<Trainer>findBysalary(double salary)
    {
        return trap.findBySalaryLessThan(salary);
    }
    public List<Trainer> findbyexp(double exp)
    {
        return trap.findByExpGreaterThanEqual(exp);
    }
    public List<Trainer>findBySalarybetween(double minsalary,double maxsalary)
    {
        return  trap.findBySalaryBetween(minsalary, maxsalary);
    }
    public List<Trainer> findbyname(String ch)
    {
        return trap.findByTnameStartingWith(ch);
    }
    public List<Trainer>findallbysalaryasc()
    {
        return trap.findAllByOrderBySalaryAsc();
    }
    public List<Trainer>findBySalaryGreaterThanOrderByTnameAsc(double salary)
    {
        return trap.findBySalaryGreaterThanOrderByTnameAsc(salary);
    }
//    public List<Trainer>findbyExpGreate(double exp)
//    {
//        return trap.findByExpGreaterThan(exp);
//    }
//    public List<Trainer>findbyExpLess(double exp)
//    {
//        return trap.findByExpGreaterLess(exp);
//    }
//    public List<Trainer>findAllByOrderByTnameDesc(String tname)
//    {
//        return trap.findAllByOrderByTnameDesc(tname);
//    }
    public List<Trainer> findBySubjectEndingWith(String subject)
    {
        return trap.findBySubjectEndingWith(subject);
    }
    public Trainer findbysalary()
    {
        return trap.findFirstByOrderBySalaryDesc();
    }
    public Trainer findbysalaryAsc()
    {
        return trap.findFirstByOrderBySalaryAsc();
    }
    public List<Trainer> findand(int tid,double exp)
    {

        return trap.findByTidAndExp(tid,exp);
    }
    public List<Trainer>findbyexpandsalary(double exp,double salary)
    {
        return trap.findByExpGreaterThanAndSalaryLessThan(exp,salary);
    }
}

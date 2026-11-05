package com.repository;

import com.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Integer> {
    public List<Trainer> findByTname(String tname);
    public List<Trainer> findBySalaryGreaterThan(double salary);
    public List<Trainer> findBySalaryLessThan(double salary);
    public List<Trainer> findByExpGreaterThanEqual(double exp);
    public List<Trainer> findBySalaryBetween(double minsalary,double maxsalary);
    public List<Trainer> findByTnameStartingWith(String ch);
    //OrderBy
    //findAllOrderBySalaryAsc()
    //findAllOrderBySalaryDesc()

    public List<Trainer>findAllByOrderBySalaryAsc();
    //findBy<Variablename>OrderBy<Fieldname>ASC()
    public List<Trainer>findBySalaryGreaterThanOrderByTnameAsc(double salary);


    //public List<Trainer> findByExpGreaterThan(double exp);
    //public List<Trainer> findByExpGreaterLess(double exp);
//    public List<Trainer> findAllByOrderByTnameDesc(String tname);
    public List<Trainer> findBySubjectEndingWith(String subject);
    public Trainer findFirstByOrderBySalaryDesc();
    public Trainer findFirstByOrderBySalaryAsc();
    public List<Trainer>findByTidAndExp(int tid,double exp);
    public List<Trainer>findByExpGreaterThanAndSalaryLessThan(double exp,double salary);



}

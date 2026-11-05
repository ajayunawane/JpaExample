package com.Service;

import com.entity.Tester;
import com.repository.TesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesterService {
    @Autowired
    TesterRepository tesp;
    public String addtester(Tester t)
    {
        tesp.save(t);
        return "Tester record added Successfully";
    }
    public String addtesterlist(List<Tester> testerList)
    {
        tesp.saveAll(testerList);
        return "Tester list Addeed Successfully";
    }
}

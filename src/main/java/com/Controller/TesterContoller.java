package com.Controller;

import com.Service.TesterService;
import com.entity.Tester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TesterContoller {
    @Autowired
    TesterService Service;
    @PostMapping("/addtester")
    public String addtester(@RequestBody Tester t)
    {
        return Service.addtester(t);
    }
    @PostMapping("/addtesterlist")
    public String addtesterlist(@RequestBody List<Tester> testerList)
    {
    return Service.addtesterlist(testerList);
    }
}

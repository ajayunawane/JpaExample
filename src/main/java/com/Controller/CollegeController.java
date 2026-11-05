package com.Controller;

import com.Service.CollegeService;
import com.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeController {
    @Autowired
    CollegeService service;
    @PostMapping("/addcollege")
    public String college(@RequestBody College c)
    {
       return service.addcollege(c) ;
    }
    @GetMapping("/findcollege")
    public List<College>findallcollege()
    {
        return service.findallcolleges();
    }
    @DeleteMapping("/deletebyid")
    public String deletebyid(@RequestParam int id)
    {
        return service.deletebyid(id);
    }
    @PatchMapping("/recordupdate")
    public String updatecollege(@RequestParam int id,@RequestBody College newc)
    {
        return service.updatebycollege(id,newc);
    }
}

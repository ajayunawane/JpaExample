package com.Controller;

import com.DTO.Userdto;
import com.Service.UserService;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;
    @PostMapping("/adduserlist")
    public String adduserlist(@RequestBody List<User> ulist)
    {
        return service.adduserlist(ulist);

    }
    @GetMapping("/findalluser")
    public List<Userdto>findalluser()
    {
        return service.finalalluser();
    }
}

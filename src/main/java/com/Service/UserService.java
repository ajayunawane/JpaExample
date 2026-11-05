package com.Service;

import com.DTO.Userdto;
import com.entity.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository ursp;
    public String adduserlist(List<User> ulist)
    {
        ursp.saveAll(ulist);
        return "User list added ";
    }
    public List<Userdto>finalalluser()
    {
        return ursp.findalluser();
    }


}

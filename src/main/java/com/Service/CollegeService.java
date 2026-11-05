package com.Service;

import com.entity.College;
import com.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    CollegeRepository cresp;
    public String addcollege(College c)
    {
        cresp.save(c);
        return "College record added Successfully";
    }
    public String addcollegelist(List<College> collegeList)
    {
        cresp.saveAll(collegeList);
        return "college list added success";
    }

    public List<College>findallcolleges()
    {
        return cresp.findAll();
    }
    public String deletebyid(int id)
    {
        if(cresp.existsById(id))
        {
            cresp.deleteById(id);
            return "College record deleted successfully";
        }
        else {
            return "No matching data found";
        }
    }
    public String updatebycollege(int id,College newc)
    {
        College existingcollege=cresp.findById(id).orElse(null);
        if(existingcollege == null)
        {
            return "No matching record found for giving id";
        }
        if(newc.getName()== null
        && newc.getAddress() == null
        && newc.getCity() == null
        )
        {
            return "No new data provide for update";
        }
        if(newc.getName() !=null)
        {
            existingcollege.setName(newc.getName());
        }
        if(newc.getAddress()!=null)
        {
            existingcollege.setAddress(newc.getAddress());
        }
        if(newc.getCity() != null)
        {
            existingcollege.setCity(newc.getCity());
        }
        return "College record add successfully added";
    }
}

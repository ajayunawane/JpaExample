//package com.Controller;
//
//import com.Service.CustomerService;
//import com.entity.Customer;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class CustomerController {
//    @Autowired
//    CustomerService service;
//    @PostMapping("/addcustlist")
//    public String addcustlist(@RequestBody List<Customer> clist)
//    {
//        return service.addcustlist(clist);
//    }
//    @GetMapping("/findallcut")
//    public Page<Customer> findallcust(@RequestParam int pageindex, @RequestParam int pagesize)
//    {
//        return service.findallcust(pageindex,pagesize);
//    }
//}

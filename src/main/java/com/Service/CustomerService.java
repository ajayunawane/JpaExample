//package com.Service;
//
//import com.entity.Customer;
//import com.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CustomerService {
//    @Autowired
//    CustomerRepository cresp;
//    public String addcustlist(List<Customer> clist)
//    {
//        cresp.saveAll(clist);
//        return "Customer list added";
//    }
//        public Page<Customer> findallcust(int pageindex, int pagesize)
//        {
//            Pageable p= PageRequest.of(pageindex,pagesize);
//            return cresp.findAll(p);
//        }
//}

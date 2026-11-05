package com.Controller;

import com.Service.ProductService;
import com.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @PostMapping("/addproductlist")
    public String addproductlist(@RequestBody List<Product> plist)
    {
        return service.addproductlist(plist);
    }

 @GetMapping("/findallproduct")
    public List<Product>findallproduct()
 {
     return service.findallproduct();
 }

 @GetMapping("/findallcategory")
    public List<Product>findallcategory(@RequestParam String category)
 {
     return service.findbycategory(category);
 }

 @GetMapping("/findbyprice")
    public List<Product> findbyprice(@RequestParam double amt)
 {
     return service.findallprice(amt);
 }

}

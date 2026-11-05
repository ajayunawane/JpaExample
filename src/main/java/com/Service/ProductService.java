package com.Service;

import com.entity.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository pres;
    public String addproductlist(List<Product> plist)
    {
        pres.saveAll(plist);
        return "Product list added";
    }
    public List<Product>findallproduct()
    {
        return pres.findallproduct();
    }
    public List<Product>findbycategory(String category)
    {
        return pres.findbycategory(category);
    }
    public List<Product>findallprice(double amt)
    {
        return pres.findbyprice(amt);
    }

}

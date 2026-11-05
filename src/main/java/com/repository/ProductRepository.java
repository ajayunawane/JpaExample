package com.repository;

import com.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.yaml.snakeyaml.tokens.Token.ID.Value;

@Repository
public interface ProductRepository extends JpaRepository<Product , Integer> {
   @Query(value = "select * from product_info", nativeQuery = true)
    public List<Product>findallproduct();

    @Query(value = "select * from product_info where category=:nm", nativeQuery = true)
    public List<Product> findbycategory(@Param("nm")String category);
//find all product whose price  is greater than given price
    @Query(value="select*from product_info where price>:amt",nativeQuery = true)
    public List<Product>findbyprice(double amt);
    //find all product whose pname starts with given char or substring
 @Query(value = "select * from product_info where pname like :ch",nativeQuery = true)
 public List<Product>findbypname(String ch);

}

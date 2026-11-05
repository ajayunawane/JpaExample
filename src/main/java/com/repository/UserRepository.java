package com.repository;

import com.DTO.Userdto;
import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
    @Query(value="select new com.DTO.Userdto(u.userid,u.firstname,u.lastname,u.role,u.email,u.contactno) from User u")
    public List<Userdto> findalluser();

}

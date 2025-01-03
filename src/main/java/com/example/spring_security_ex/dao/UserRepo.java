package com.example.spring_security_ex.dao;

import com.example.spring_security_ex.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUserName(String username);
}

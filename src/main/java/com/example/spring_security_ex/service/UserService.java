package com.example.spring_security_ex.service;

import com.example.spring_security_ex.dao.UserRepo;
import com.example.spring_security_ex.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(10);

    public Users saveUsers(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}

package com.etnopolino.project.service;

import com.etnopolino.project.model.Users;
import com.etnopolino.project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    public Users register(Users user){
        return repo.save(user);
    }
}

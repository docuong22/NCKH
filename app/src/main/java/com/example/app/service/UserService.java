package com.example.app.service;
import com.example.app.entity.User;
import com.example.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public List<User> findAll() {
        return repository.findAll();
    }
    public User getOne(long id)
    {
        return repository.findById(id).orElse(null);
    }

}

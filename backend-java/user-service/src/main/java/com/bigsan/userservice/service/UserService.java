package com.bigsan.userservice.service;

import com.bigsan.userservice.model.User;
import com.bigsan.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User create(User user){
        return repository.save(user);
    }

    public List<User> getAll(){
        return repository.findAll();
    }
}
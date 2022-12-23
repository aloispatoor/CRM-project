package com.m2i.CRM.service.impl;

import com.m2i.CRM.entity.User;
import com.m2i.CRM.repository.UserRepository;
import com.m2i.CRM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repo;

    public List<User> getAllUsers(){

        return repo.findAll();
    }

    public User addUser(User u){
        u = new User();
        return repo.save(u);
    }

    public Optional<User> getUserById(int id){
        return repo.findById(id);
    }

    public String deleteUser(int id){
        if(repo.findById(id).isPresent()){
            repo.deleteById(id);
            return "User removed successfully";
        }
        return "No User found";
    }

    public User updateUser(User u){
        User newUser = repo.findById(u.getId()).orElse(null);
        if(newUser != null){
            newUser.setEmail(u.getEmail());
            newUser.setGrants(u.getGrants());
            newUser.setUsername(u.getUsername());
            newUser.setPassword(u.getPassword());
            repo.save(newUser);
        }
        return newUser;
    }
}

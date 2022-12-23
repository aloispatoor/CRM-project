package com.m2i.CRM.service;

import com.m2i.CRM.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();
    Optional<User> getUserById(int id);
    User addUser(User u);
    String deleteUser(int id);
    User updateUser(User u);

}

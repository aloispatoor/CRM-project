package com.m2i.CRM.controller;

import com.m2i.CRM.controller.dto.UserDto;
import com.m2i.CRM.entity.User;
import com.m2i.CRM.mapper.UserMapper;
import com.m2i.CRM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    private UserMapper mapper;


    @GetMapping("")
    public ResponseEntity<List<UserDto>> getAll(){
        return ResponseEntity.ok(service.getAllUsers().stream().map(
                mapper::mapUserToUserDto
        ).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserDto>> getById(@PathVariable int id){
        return ResponseEntity.ok(mapper.mapUserToUserDto(service.getUserById(id)));
    }

    @PostMapping("")
    public ResponseEntity<Void> post(@Valid @RequestBody UserDto u){
        service.addUser(mapper.mapUserDtoToUser(u));
        return new ResponseEntity<>(HttpStatus.CREATED);

//        User user = new User();
//        user.setUsername(u.getUsername());
//        user.setEmail(u.getEmail());
//        user.setPassword(u.getPassword());
//        User savedUser = service.addUser(user);
//
//        UserDto userResponse = new UserDto();
//        userResponse.setId(savedUser.getId());
//        userResponse.setUsername(savedUser.getUsername());
//        userResponse.setEmail(savedUser.getEmail());
//        userResponse.setPassword(savedUser.getPassword());
//
//        return new ResponseEntity<UserDto>(userResponse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable int id, @RequestBody UserDto u){
        u.setId(id);
        return ResponseEntity.ok(service.updateUser(mapper.mapUserDtoToUser(u)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        return ResponseEntity.ok(service.deleteUser(id));
    }

}

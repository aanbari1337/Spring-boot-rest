package com.aanbari.restfulwebservice.restfulwebservice.controller;

import com.aanbari.restfulwebservice.restfulwebservice.exception.UserNotFoundException;
import com.aanbari.restfulwebservice.restfulwebservice.model.User;
import com.aanbari.restfulwebservice.restfulwebservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @PostMapping("/user")
    public ResponseEntity<User> postUser(@RequestBody User user){

        User newUser = userService.addUser(user);

        return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
    }
}

package com.aanbari.restfulwebservice.restfulwebservice.service;

import com.aanbari.restfulwebservice.restfulwebservice.exception.UserNotFoundException;
import com.aanbari.restfulwebservice.restfulwebservice.model.User;
import com.aanbari.restfulwebservice.restfulwebservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }
    public User getUserById(int id) throws UserNotFoundException {
        return userRepository.getById(id);
    }
    public void deleteUser(int id){
         userRepository.deleteById(id);
    }
}

package com.aanbari.restfulwebservice.restfulwebservice.controller;

import com.aanbari.restfulwebservice.restfulwebservice.model.Role;
import com.aanbari.restfulwebservice.restfulwebservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("/role")
    public ResponseEntity<Role> postUser(@RequestBody Role role){

        Role newRole = roleService.addRole(role);

        return new ResponseEntity<Role>(newRole, HttpStatus.CREATED);
    }
}

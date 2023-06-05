package com.aanbari.restfulwebservice.restfulwebservice.service;

import com.aanbari.restfulwebservice.restfulwebservice.model.Role;
import com.aanbari.restfulwebservice.restfulwebservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public Role addRole(Role role){
        return roleRepository.save(role);
    }
}

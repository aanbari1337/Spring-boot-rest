package com.aanbari.restfulwebservice.restfulwebservice.repository;

import com.aanbari.restfulwebservice.restfulwebservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}

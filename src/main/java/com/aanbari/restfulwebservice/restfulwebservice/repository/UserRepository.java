package com.aanbari.restfulwebservice.restfulwebservice.repository;

import com.aanbari.restfulwebservice.restfulwebservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}

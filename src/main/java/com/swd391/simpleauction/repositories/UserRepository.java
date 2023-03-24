package com.swd391.simpleauction.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swd391.simpleauction.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

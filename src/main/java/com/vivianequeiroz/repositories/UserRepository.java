package com.vivianequeiroz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivianequeiroz.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

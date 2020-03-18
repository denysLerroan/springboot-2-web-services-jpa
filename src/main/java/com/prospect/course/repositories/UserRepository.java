package com.prospect.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospect.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

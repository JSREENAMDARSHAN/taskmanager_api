package com.darshan.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshan.taskmanager.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
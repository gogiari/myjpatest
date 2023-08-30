package com.example.myjpatest.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myjpatest.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}

package com.example.springboot_data_jpa.repository;

import com.example.springboot_data_jpa.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

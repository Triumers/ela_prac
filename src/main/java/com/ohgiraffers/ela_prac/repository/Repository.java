package com.ohgiraffers.ela_prac.repository;

import com.ohgiraffers.ela_prac.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Integer> {
}

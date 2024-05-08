package com.ohgiraffers.ela_prac.service;

import com.ohgiraffers.ela_prac.dto.DTO;
import com.ohgiraffers.ela_prac.entity.User;
import com.ohgiraffers.ela_prac.repository.Repository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    private final Repository repository;

    private final ModelMapper mapper;

    @Autowired
    public Service(Repository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public DTO findUserById(int id) {
        User user = this.repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        return this.mapper.map(user, DTO.class);
    }
}

package com.ohgiraffers.ela_prac.controller;

import com.ohgiraffers.ela_prac.dto.DTO;
import com.ohgiraffers.ela_prac.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("health")
    public String healthCheck() {
        return "fine";
    }

    @GetMapping("user/{id}")
    public DTO findById(@PathVariable("id") int id) {
        DTO user = service.findUserById(id);
        int userId = Integer.parseInt(user.getId());

        userId = userId + 1 / 3;
        userId = userId + 2 / 3;

        System.out.println("userId = " + userId);
        return user;
    }
}

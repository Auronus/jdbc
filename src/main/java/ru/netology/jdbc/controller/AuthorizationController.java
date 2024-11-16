package ru.netology.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.repository.CustomerRepository;

@RestController
public class AuthorizationController {
    @Autowired
    CustomerRepository repository;

    @GetMapping("/products/fetch-product")
    public String getAuthorities(String name) {
        return repository.getProductName(name);
    }
}

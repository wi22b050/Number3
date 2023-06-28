package com.example.demo.controller;

import com.example.demo.service.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class NumbersController {

    private final NumbersService numbersService;

    @Autowired
    private NumbersController(NumbersService numbersService){
        this.numbersService = numbersService;
    }

}
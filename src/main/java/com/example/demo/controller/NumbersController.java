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

    @PostMapping("/add")
    public ResponseEntity<Integer> addNumbers(@RequestParam int a, @RequestParam int b){
        int result = numbersService.addNumbers(a,b);
        return ResponseEntity.ok(result);
    }
    @PostMapping("/divide")
    public ResponseEntity<Integer> divideNumbers(@RequestParam int a, @RequestParam int b){
        int result = numbersService.divideNumbers(a,b);
        return ResponseEntity.ok(result);
    }

}
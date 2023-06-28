package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class NumbersService {

    public int addNumbers(int a, int b){
        return a+b;
    }

}
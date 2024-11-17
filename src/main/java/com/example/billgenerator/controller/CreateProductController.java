package com.example.billgenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billgenerator.model.createproductrequestdto;
import com.example.billgenerator.service.CreateProductService;

@RestController
@RequestMapping("/api/createproduct")

public class CreateProductController {

    @Autowired(required = true)
    private CreateProductService createproductservice;

    @PostMapping("/")
    public ResponseEntity<String> CreateOrder(@RequestBody createproductrequestdto model) {
    	String createproduct = createproductservice.PutCreateProductService(model);
        return new ResponseEntity<>(createproduct, HttpStatus.CREATED);
}
}

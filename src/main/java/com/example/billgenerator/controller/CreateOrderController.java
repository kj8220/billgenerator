package com.example.billgenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billgenerator.model.createorderrequestdto;
import com.example.billgenerator.service.CreateOrderService;

@RestController
@RequestMapping("/api/createorder")

public class CreateOrderController {

    @Autowired(required = true)
    private CreateOrderService createorderservice;

    @PostMapping("/")
    public ResponseEntity<String> CreateOrder(@RequestBody createorderrequestdto model) {
    	String createorder = createorderservice.PutCreateOrderService(model);
        return new ResponseEntity<>(createorder, HttpStatus.CREATED);
}
}



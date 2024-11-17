package com.example.billgenerator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.billgenerator.model.searchorderresponsemodel;
import com.example.billgenerator.service.SearchOrderService;

@RestController
@RequestMapping("/api/searchorder")
public class SearchOrderController {

    @Autowired
    private SearchOrderService searchOrderService;

    @GetMapping("/")
    public ResponseEntity<List<searchorderresponsemodel>> productList(
        @RequestParam(value = "customer_id", required = false) String customerId,
        @RequestParam(value = "status", required = false) String status,
        @RequestParam(value = "order_date", required = false) String orderDate) {
        

        List<searchorderresponsemodel> result = searchOrderService.GetSearchOrderservice(customerId, status, orderDate);
        return ResponseEntity.ok(result);
    }
}

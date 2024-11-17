package com.example.billgenerator.controller;
import com.fasterxml.jackson.databind.JsonNode;

import com.example.billgenerator.service.ProductListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productlist")

public class ProductListController {

    @Autowired(required = true)
    private ProductListService productlistservice;

    @GetMapping("/")
    public JsonNode ProductList(@RequestParam(required = false) String productname) {
        if (productname == null || productname.isEmpty()) {
            return productlistservice.GetProductListservice("");
        }else {
        return productlistservice.GetProductListservice(productname);
    }
}
}
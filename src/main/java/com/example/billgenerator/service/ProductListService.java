package com.example.billgenerator.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.example.billgenerator.repository.ProductListRepository;

import com.fasterxml.jackson.databind.JsonNode;
@Service
public class ProductListService {

	   @Autowired
	    private ProductListRepository productListRepository;

	    @Autowired
	    private ObjectMapper objectMapper;

	    public JsonNode GetProductListservice(String productName) {
	        String jsonString = productListRepository.getProductList(productName);
	        try {
	            return objectMapper.readTree(jsonString);
	        } catch (Exception e) {
	            throw new RuntimeException("Error parsing JSON response from stored function", e);
	        }
	    }
}

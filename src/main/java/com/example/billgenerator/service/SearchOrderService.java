package com.example.billgenerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billgenerator.model.searchorderresponsemodel;
import com.example.billgenerator.repository.SearchOrderRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SearchOrderService {

	   @Autowired
	    private SearchOrderRepository searchOrderRepository;

	    public List<searchorderresponsemodel> GetSearchOrderservice(String customer_id,String status,String start_date) {
	        String rawResponse = searchOrderRepository.getSearchList(customer_id, status, start_date);
	        try {
	            ObjectMapper objectMapper = new ObjectMapper();
	            return objectMapper.readValue(rawResponse, new TypeReference<List<searchorderresponsemodel>>() {});

	        } catch (Exception e) {
	            throw new RuntimeException("Error parsing JSON response from stored function", e);
	        }
	    }
}

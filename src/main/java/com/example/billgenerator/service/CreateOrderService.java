package com.example.billgenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billgenerator.model.createorderrequestdto;
import com.example.billgenerator.repository.CreateOrderRepository;

@Service
public class CreateOrderService {

	    @Autowired
	    private CreateOrderRepository createorderrepository;

	    public String PutCreateOrderService(createorderrequestdto requestmodel) {
	        try {
		        return createorderrepository.createOrder(requestmodel.getCustomer_name(),requestmodel.getEmail(),requestmodel.getPhone_number(),requestmodel.getAddress(),requestmodel.getProduct_name(),requestmodel.getStatus());
	        } catch (Exception e) {
	            throw new RuntimeException("Error inserting order", e);
	        }
	    }
}

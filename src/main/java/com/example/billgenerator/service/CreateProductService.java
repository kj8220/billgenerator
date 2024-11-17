package com.example.billgenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billgenerator.model.createproductrequestdto;
import com.example.billgenerator.repository.CreateProductRepository;

@Service
public class CreateProductService {

	    @Autowired
	    private CreateProductRepository createproductrepository;

	    public String PutCreateProductService(createproductrequestdto requestmodel) {
	        try {
		        return createproductrepository.createProduct(requestmodel.getProduct_name(),requestmodel.getPrice(),requestmodel.getDescription(),requestmodel.isWarranty());
	        } catch (Exception e) {
	            throw new RuntimeException("Error inserting order", e);
	        }
	    }
}

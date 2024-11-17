package com.example.billgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.billgenerator.model.productlistmodel;

@Repository
public interface CreateProductRepository extends JpaRepository<productlistmodel, String> { // Change String to Long if ID is Long
    
    @Query(value = "SELECT create_update_product(:product_name, :price, :description, :warranty)", nativeQuery = true)
    String createProduct(@Param("product_name") String product_name, 
                       @Param("price") int price, 
                       @Param("description") String description,
                       @Param("warranty") Boolean warranty);
}

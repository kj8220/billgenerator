package com.example.billgenerator.repository;

import com.example.billgenerator.model.ordermodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateOrderRepository extends JpaRepository<ordermodel, String> { // Change String to Long if ID is Long
    
    @Query(value = "SELECT create_order(:customer_name, :email, :phone_number, :address, :product_name, :status)", nativeQuery = true)
    String createOrder(@Param("customer_name") String customer_name, 
                       @Param("email") String email, 
                       @Param("phone_number") String phone_number,
                       @Param("address") String address, 
                       @Param("product_name") String productName,
                       @Param("status") String status);
}

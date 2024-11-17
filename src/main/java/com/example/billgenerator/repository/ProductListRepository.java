package com.example.billgenerator.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.billgenerator.model.productlistmodel;


@Repository
public interface ProductListRepository extends JpaRepository<productlistmodel, String> 
{ 
	   @Query(value = "SELECT CAST(product_list(:product_name) AS CHAR)", nativeQuery = true)
	    String getProductList(@Param("product_name") String product_name);
}

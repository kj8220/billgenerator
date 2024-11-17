package com.example.billgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.billgenerator.model.ordermodel;

@Repository
public interface SearchOrderRepository extends JpaRepository<ordermodel, String> 
{  
	@Query(value = "SELECT CAST(search_order(:customer_id, :status, :start_date) AS CHAR)", nativeQuery = true)
		String getSearchList(@Param("customer_id") String customer_id,
        @Param("status") String status,
        @Param("start_date") String start_date);
}

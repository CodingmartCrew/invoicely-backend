package com.invoicely.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.invoicely.invoice.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

	 @Query("FROM Invoice WHERE createdby=:email")
	    Invoice findByCreatedBy(@Param("email") String email);	
}

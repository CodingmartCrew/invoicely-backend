package com.invoicely.invoice.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoicely.invoice.model.Invoice;

@Repository
@Transactional
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

	    List<Invoice> findAllByCreatedby(String createdby);	
}

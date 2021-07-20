package com.invoicely.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.invoicely.invoice.model.Invoice;
import com.invoicely.invoice.repository.InvoiceRepository;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	// save invoice
	@PostMapping("/save")
	private @ResponseBody Invoice createInvoice(@RequestBody Invoice invoice) {
		return this.invoiceRepository.save(invoice);
	}
	// get all invoices
	@GetMapping("/all")
	private @ResponseBody List<Invoice> getAllInvoices() {
		return this.invoiceRepository.findAll();
	}
	// get invoice by id
	@GetMapping("/find/{id}")
	private Invoice getInvoiceByid(@PathVariable("id") long id) {
		Invoice invoice = this.invoiceRepository.findById(id).get();
		return invoice;
	}
	// get invoice by email
	@GetMapping("/findbymail")
	private Invoice getInvoiceByEmail(@RequestBody Invoice invoice) {
		return this.invoiceRepository.findByCreatedBy(invoice.getCreatedby());
	}
	
}

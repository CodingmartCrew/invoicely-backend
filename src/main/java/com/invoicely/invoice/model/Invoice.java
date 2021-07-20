package com.invoicely.invoice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "invoices")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name= "companyname")
	private String companyname;
	@Column(name= "pdftitle")
	private String pdftitle;
	@Column(name= "address1")
	private String address1;
	@Column(name= "address2")
	private String address2;
	@Column(name= "address3")
	private String address3;
	@Column(name= "phno")
	private String phno;
	@Column(name= "email")
	private String email;
	@Column(name= "createdby")
	private String createdby;

	@Column(name= "date")
	private String date;
	@Column(name= "invoiceno")
	private String invoiceno;
	@Column(name= "ponumber")
	private String ponumber;
	@Column(name= "attender")
	private String attender;
	@Column(name= "clientname")
	private String clientname;
	@Column(name= "maincontent")
	private String maincontent;
	@Column(name= "invoice_items")
	private String invoice_items;
	@Column(name= "footcontent")
	private String footcontent;
	 
	
	public Invoice() {
		super();
	}
	
	public Invoice(String companyname, String pdftitle, String address1, String address2, String address3, String phno,
			String email, String createdby, String date, String invoiceno, String ponumber, String attender,
			String clientname, String maincontent, String invoice_items, String footcontent) {
		super();
		this.companyname = companyname;
		this.pdftitle = pdftitle;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.phno = phno;
		this.email = email;
		this.createdby = createdby;
		this.date = date;
		this.invoiceno = invoiceno;
		this.ponumber = ponumber;
		this.attender = attender;
		this.clientname = clientname;
		this.maincontent = maincontent;
		this.invoice_items = invoice_items;
		this.footcontent = footcontent;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	public String getCreatedby() {
		return createdby;
	}
	
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getPdftitle() {
		return pdftitle;
	}

	public void setPdftitle(String pdftitle) {
		this.pdftitle = pdftitle;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	public String getPonumber() {
		return ponumber;
	}

	public void setPonumber(String ponumber) {
		this.ponumber = ponumber;
	}

	public String getAttender() {
		return attender;
	}

	public void setAttender(String attender) {
		this.attender = attender;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getMaincontent() {
		return maincontent;
	}

	public void setMaincontent(String maincontent) {
		this.maincontent = maincontent;
	}

	public String getInvoice_items() {
		return invoice_items;
	}

	public void setInvoice_items(String invoice_items) {
		this.invoice_items = invoice_items;
	}

	public String getFootcontent() {
		return footcontent;
	}

	public void setFootcontent(String footcontent) {
		this.footcontent = footcontent;
	}
	
}

package com.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer 
{
	@Id
	@Column(name="customerId")
	private Integer cid;
	
	@Column(name="customerName")
	private String cname;
	
	@Column(name="customerAddress")
	private String caddress;
	
	@Column(name="customerSalary")
	private double csalary;
}

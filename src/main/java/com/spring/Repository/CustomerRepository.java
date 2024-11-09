package com.spring.Repository;
import org.springframework.data.repository.CrudRepository;

import com.spring.entity.Customer;
public interface CustomerRepository extends CrudRepository<Customer,Integer>  
{
	
}

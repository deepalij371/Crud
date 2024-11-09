package com.spring;

import java.util.Arrays;
import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.spring.Repository.CustomerRepository;
import com.spring.entity.Customer;

@SpringBootApplication
public class CrudRepositoryApplication 
{
public static void main(String[] args) 
	{
		ConfigurableApplicationContext run = SpringApplication.run(CrudRepositoryApplication.class, args);
		CustomerRepository bean = run.getBean(CustomerRepository.class);
//		Customer c1=new Customer(101,"deeepali","ctc",23300);
		Customer c2=new Customer(102,"lalita","bbsr",26700);
		Customer c3=new Customer(103,"mani","hyd",3300);
		Customer c4=new Customer(104,"swarup","vadrak",3900);
		bean.saveAll(Arrays.asList(c2,c3,c4));
		System.out.println("inserted successfully");
		
		Optional<Customer> byId = bean.findById(101);
		if(byId.isPresent())
		{
			System.out.println(byId.get());
		}
		
		Iterable<Customer> allById = bean.findAllById(Arrays.asList(102,103,104));
		allById.forEach(n->System.out.println(n));
		
		Iterable<Customer> all = bean.findAll();
		all.forEach(n->System.out.println(n));
		
		long count = bean.count();
		System.out.println("total records are available:"+count);
	}
}

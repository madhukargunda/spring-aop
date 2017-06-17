package com.study.pattern.gateway.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.study.pattern.bo.Customer;
import com.study.pattern.gateway.CustomerGateway;
@Component
public class CustomerGatewayImpl implements CustomerGateway {
	
static ArrayList<Customer> list = new ArrayList<Customer>();
	
	static {
		list.add(new Customer("Faaa","Laaa","1"));
		list.add(new Customer("Fbbb","Lbbb","2"));
		list.add(new Customer("Fccc","Lccc","3"));
		list.add(new Customer("Fddd","Lbbb","4"));
		list.add(new Customer("Eeee","Feee","5"));
		list.add(new Customer("Gaaa","Gbbb","6"));
		list.add(new Customer("Haaa","Hbbbb","7"));
	}


	@Override
	public List<Customer> getGatewayCustomerList() {
		return list;
	}

}

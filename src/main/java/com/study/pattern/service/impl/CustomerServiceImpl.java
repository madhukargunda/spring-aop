package com.study.pattern.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.pattern.bo.Customer;
import com.study.pattern.gateway.impl.CustomerGatewayImpl;
import com.study.pattern.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerGatewayImpl customerGateway;

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return customerGateway.getGatewayCustomerList();
	}

}

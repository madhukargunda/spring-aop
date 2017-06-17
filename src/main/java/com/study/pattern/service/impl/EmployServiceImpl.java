package com.study.pattern.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.pattern.bo.Employe;
import com.study.pattern.gateway.impl.EmployeGatewayImpl;
import com.study.pattern.service.EmployeService;

@Service
public class EmployServiceImpl implements EmployeService {

	@Autowired
	EmployeGatewayImpl employeGateway;

	@Override
	public void updateEmploye(Integer employeId) {
	
	}

	@Override
	public List<Employe> getEmployeList() {
		return employeGateway.getGatewayEmployeList(1);
	}

}

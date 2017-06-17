package com.study.pattern.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.pattern.bo.Audit;
import com.study.pattern.bo.Employe;
import com.study.pattern.gateway.EmployeGateway;
import com.study.pattern.service.EmployeService;

@Service
public class EmployServiceImpl implements EmployeService {

	@Autowired
	EmployeGateway employeGateway;

	@Override
	public void updateEmploye(Integer employeId) {

	}

	@Override
	public List<Employe> getEmployeList(Integer i ,Audit audit) {
		return employeGateway.getGatewayEmployeList(1);
	}

}

package com.study.pattern.gateway.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.study.pattern.bo.Employe;
import com.study.pattern.gateway.EmployeGateway;

@Component
public class EmployeGatewayImpl implements EmployeGateway {
	
static ArrayList<Employe> list = new ArrayList<Employe>();

	
	static {
		list.add(new Employe("Faaa","Laaa"));
		list.add(new Employe("Fbbb","Lbbb"));
		list.add(new Employe("Fccc","Lccc"));
		list.add(new Employe("Fddd","Lbbb"));
		list.add(new Employe("Eeee","Feee"));
		list.add(new Employe("Gaaa","Gbbb"));
		list.add(new Employe("Haaa","Hbbbb"));
	}

	@Override
	public List<Employe> getGatewayEmployeList(Integer employeId) {
		return list;
	}

}

package com.study.pattern.service;

import java.util.List;

import com.study.pattern.bo.Employe;

public interface EmployeService {

	public List<Employe> getEmployeList();

	public void updateEmploye(Integer employeId);

}

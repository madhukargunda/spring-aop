package com.study.pattern.service;

import java.util.List;

import com.study.pattern.bo.Audit;
import com.study.pattern.bo.Employe;

public interface EmployeService {

	public List<Employe> getEmployeList(Integer id, Audit audit);

	public void updateEmploye(Integer employeId);

}

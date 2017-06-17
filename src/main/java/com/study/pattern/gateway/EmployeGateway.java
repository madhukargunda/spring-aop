package com.study.pattern.gateway;

import java.util.List;

import com.study.pattern.aspect.AuditEvent;
import com.study.pattern.bo.Employe;

public interface EmployeGateway {

	@AuditEvent(gateWayName="EMPLOYEE_GATEWAY",serviceName="EMPLOYE_SERVICE")
	public List<Employe> getGatewayEmployeList(Integer employeId) ;
	
}

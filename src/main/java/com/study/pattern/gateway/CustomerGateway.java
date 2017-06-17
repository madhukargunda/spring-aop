package com.study.pattern.gateway;

import java.util.List;

import com.study.pattern.aspect.AuditEvent;
import com.study.pattern.bo.Customer;

public interface CustomerGateway {
	
	@AuditEvent(gateWayName="CUSTOMER_GATEWAY",serviceName="CUSTOMER_SERVICE") //These two are enums ,for test purpose i added as strings
	public List<Customer> getGatewayCustomerList() ;
}

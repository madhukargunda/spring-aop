package com.study.pattern.bo;

public class Audit {

	private String gateWayName;

	private String serviceName;
	
	

	public Audit(String gateWayName, String serviceName) {
		super();
		this.gateWayName = gateWayName;
		this.serviceName = serviceName;
	}


	public String getGateWayName() {
		return gateWayName;
	}

	public void setGateWayName(String gateWayName) {
		this.gateWayName = gateWayName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}

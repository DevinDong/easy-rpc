package com.ctrip.easyrpc.meta;

public class MetaData {

    private String serviceName;

    private String methodName;

    private Object request;

    private Object response;

    public String getServiceName() {
	return serviceName;
    }

    public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
    }

    public String getMethodName() {
	return methodName;
    }

    public void setMethodName(String methodName) {
	this.methodName = methodName;
    }

    public Object getRequest() {
	return request;
    }

    public void setRequest(Object request) {
	this.request = request;
    }

    public Object getResponse() {
	return response;
    }

    public void setResponse(Object response) {
	this.response = response;
    }

}

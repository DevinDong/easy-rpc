package com.ctrip.easyrpc.server;

import java.util.HashMap;
import java.util.Map;

import com.ctrip.easyrpc.exception.ServiceNotFoundException;

public class ServiceContext {

    private Map<String, Class<?>> _services = new HashMap<>();

    public Class<?> getServiceClass(String clsName) {
	if (_services.containsKey(clsName)) {
	    return _services.get(clsName);
	}
	throw new ServiceNotFoundException();
    }

}


package com.pibigstar.dubbo.remote.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pibigstar.dubbo.remote.TestService;

public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		return  "Hello " + name + "!";
	}

}

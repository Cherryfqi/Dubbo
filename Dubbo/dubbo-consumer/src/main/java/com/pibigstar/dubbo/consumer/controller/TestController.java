package com.pibigstar.dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.pibigstar.dubbo.remote.TestService;

@RestController
public class TestController {

	@Autowired  
	TestService testService;  

	@RequestMapping("/test/{name}")  
	public JSONObject testJson(@PathVariable("name") String name) {  
		JSONObject jsonObject = new JSONObject();  

		String testStr = testService.sayHello(name);  
		jsonObject.put("str", testStr);  
		return jsonObject;  
	}  
}

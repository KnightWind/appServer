package cn.com.sxit.wearable.appserver.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sxit.wearable.appserver.dao.TestUserDao;

@RestController
@RequestMapping(value="anothert")
public class AnthoerTestContorller {
		
	
	@Resource
	TestUserDao dao;
	
	@RequestMapping(value="getData",method=RequestMethod.GET)
	public String getData(){
		return "";
	}
}

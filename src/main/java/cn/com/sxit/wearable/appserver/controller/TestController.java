package cn.com.sxit.wearable.appserver.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sxit.wearable.appserver.dao.TestUserDao;
import cn.com.sxit.wearable.appserver.pojo.User;


@RestController
@RequestMapping(value = "test")
public class TestController {
	
	@Resource
	TestUserDao dao;
	
	
	@RequestMapping(value = "addData", method = RequestMethod.GET)
	public @ResponseBody String getDatalist(){
		
		
		User u = new User();
		
		u.setPassword("myPwd");
		u.setUsername("userName");
		
		dao.addUser(u);
		
		System.out.println("the gen id is "+u.getId());
		
		return "hei!";
	}
	
	
	@RequestMapping(value = "getData/{id}", method = RequestMethod.GET)
	public User getDatalist(@PathVariable("id") long id){
		
		
		return dao.getUserById(id);
		
	}
	
	
	@RequestMapping(value = "getData/{id}", method = RequestMethod.GET,params = {})
	public String paramsTest(String name, String pwd){
		
		return "";
	}
	
}

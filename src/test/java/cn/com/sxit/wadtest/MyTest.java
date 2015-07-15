package cn.com.sxit.wadtest;

import org.junit.Test;

import cn.com.sxit.wearable.appserver.pojo.User;

public class MyTest {
	
	@Test
	public void baseTest(){
		
		
		User u = new User();
		
		u.setPassword("myPwd");
		u.setUsername("userName");
		
		
		System.out.println("hei i'am tester ");
	}

}

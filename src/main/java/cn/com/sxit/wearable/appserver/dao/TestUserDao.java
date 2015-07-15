package cn.com.sxit.wearable.appserver.dao;

import cn.com.sxit.wearable.appserver.pojo.User;

public interface TestUserDao {
	
	public void addUser(User u);
	
	
	public User getUserById(long id);
	
}

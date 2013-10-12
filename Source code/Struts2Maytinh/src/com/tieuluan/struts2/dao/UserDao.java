package com.tieuluan.struts2.dao;

import java.util.List;

import com.tieuluan.struts2.model.User;

/**
 * @author Dinesh Rajput
 *
 */
public interface UserDao {
	void saveUser(User user);
	
	List<User> getUserList(); 
}

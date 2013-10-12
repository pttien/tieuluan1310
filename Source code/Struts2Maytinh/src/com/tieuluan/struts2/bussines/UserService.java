package com.tieuluan.struts2.bussines;

import java.util.List;

import com.tieuluan.struts2.model.User;

/**
 * @author Dinesh Rajput
 *
 */
public interface UserService {
	void saveUser(User user);
	
	List<User> getUserList(); 
}

package com.tieuluan.struts2.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tieuluan.struts2.bussines.UserService;
import com.tieuluan.struts2.model.User;


/**
 * @author Dinesh Rajput
 *
 */
public class UserAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService userService;
    private List<User> listuser;
	public String execute()	{
//		users = CommonUtility.createUserBeanList(userService.getUserList());
		listuser =userService.getUserList();
		return "user";
	}
	public List<User> getListuser() {
		return listuser;
	}
	public void setListuser(List<User> listuser) {
		this.listuser = listuser;
	}
	
}
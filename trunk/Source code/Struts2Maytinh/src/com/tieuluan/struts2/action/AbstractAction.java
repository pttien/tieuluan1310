/*
 * AbstractAction.java	1.0  25/03/2013 
 *
 * Copyright 2011 Viettel Telecom. All rights reserved.
 * VIETTEL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tieuluan.struts2.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;




/**
 * The Class AbstractAction.
 */
public class AbstractAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 5255044268632756041L;
	public static final String JSON = "json";
	protected Map<String, Object> result = new HashMap<String, Object>();

	@Override
	public void prepare() throws Exception {
		
		
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
	

	
}

package com.ceit.svg.display.action;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import com.ceit.svg.display.dao.ViewSvgDao;
import com.ceit.svg.display.dao.ViewSvgDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ViewSvgAction extends ActionSupport {
	private InputStream inputStream; 
	private ViewSvgDao viewSvgDao = new ViewSvgDaoImpl();
	
	

	public InputStream getInputStream() {
		return inputStream;
	}

	public String execute() throws Exception {
		System.out.println("调用ViewSvgAction");
		System.out.println();
		return SUCCESS;
	}
	
	public String getSvgFile() throws Exception {
		System.out.println("调用ViewSvgAction_getSvgFile()");
		viewSvgDao.getSvgFileById(47);
		inputStream = viewSvgDao.getSvgFileById(47).getBinaryStream(); 
		return SUCCESS;
	}
	
	

}

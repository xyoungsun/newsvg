package com.ceit.svg.display.dao;



import java.sql.Blob;
import java.sql.SQLException;

import org.hibernate.Session;

import com.ceit.svg.entity.SvgGraphic;
import com.ceit.svg.hibernate.HibernateSessionUtil;

public class ViewSvgDaoImpl implements ViewSvgDao {


	
	public Blob getSvgFileById(int id) {
		//HibernateSessionUtil.beginTransaction();
		Session session = HibernateSessionUtil.currentSession();
		SvgGraphic sg = (SvgGraphic)session.get(SvgGraphic.class, id);
		
		return sg.getData();
	}

}

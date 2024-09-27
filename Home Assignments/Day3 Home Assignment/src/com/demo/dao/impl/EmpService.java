package com.demo.dao.impl;
import com.demo.entity.EmpDao;
import com.demo.dao.EmpDaoMocHibernateImpl;
import com.demo.dao.EmpDaoMocJdbcImpl;
import com.demo.dao.EmpJdbc;

public class EmpService {

	public EmpDao getObject(String check)
	{
		if(check=="jdbc")
			return new EmpJdbc();
		if(check=="jdbc impl")
			return new EmpDaoMocJdbcImpl();
		if(check=="hibernate")
			return new EmpDaoMocHibernateImpl();
		else return null;
	}
}

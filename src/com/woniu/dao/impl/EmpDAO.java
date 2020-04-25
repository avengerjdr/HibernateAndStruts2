package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.woniu.dao.IEmp;
import com.woniu.pojo.Emp;
import com.woniu.util.HibernateUtil;

public class EmpDAO implements IEmp {

	Session session=HibernateUtil.getSession();
	@Override
	public void save(Emp emp) {
		session.save(emp);
	}

	@Override
	public void delete(Emp emp) {

		session.delete(emp);
	}

	@Override
	public void update(Emp emp) {
		session.update(emp);
	}

	@Override
	public Emp findOne(Integer empno) {
	
		return	(Emp)session.get(Emp.class, empno);
		
	}
	
	@Override
	public List<Emp> findAll() {
		return session.createQuery("from Emp").list();
	}
}

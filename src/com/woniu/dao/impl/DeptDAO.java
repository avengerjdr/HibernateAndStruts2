package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.woniu.dao.IDept;
import com.woniu.pojo.Dept;
import com.woniu.util.HibernateUtil;

public class DeptDAO implements IDept {
	Session session=HibernateUtil.getSession();
	@Override
	public void save(Dept dept) {
		session.save(dept);
	}

	@Override
	public void delete(Dept dept) {
		session.delete(dept);
	}

	@Override
	public void update(Dept dept) {
		session.update(dept);
	}

	@Override
	public Dept findOne(Integer deptno) {
		return	(Dept)session.get(Dept.class, deptno);
		
	}

	@Override
	public List<Dept> findAll() {
		
		return session.createQuery("from Dept").list();
	}

}

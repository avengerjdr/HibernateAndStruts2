package com.woniu.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.woniu.dao.IDept;
import com.woniu.dao.impl.DeptDAO;
import com.woniu.pojo.Dept;
import com.woniu.pojo.Emp;
import com.woniu.service.IDeptService;
import com.woniu.util.HibernateUtil;

public class DeptService implements IDeptService {
	IDept d=new DeptDAO();
	@Override
	public void addDept(Dept dept) {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
			d.save(dept);
			trans.commit();
			session.close();
	}

	@Override
	public void editDept(Dept dept) {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		d.update(dept);
		trans.commit();
		session.close();
	}

	@Override
	public void deleteDept(Dept dept) {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		d.delete(dept);
		trans.commit();
		session.close();
	}
	

	@Override
	public Dept getDeptByDeptno(Integer deptno) {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		Dept dd=d.findOne(deptno);
		trans.commit();
		return dd;
		
	}

	@Override
	public List<Dept> getAllDepts() {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		List<Dept> dd=d.findAll();
		trans.commit();
		return dd;
	}

}

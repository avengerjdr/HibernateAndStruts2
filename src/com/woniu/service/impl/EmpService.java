package com.woniu.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.woniu.dao.IEmp;
import com.woniu.dao.impl.EmpDAO;
import com.woniu.pojo.Emp;
import com.woniu.service.IEmpService;
import com.woniu.util.HibernateUtil;

public class EmpService implements IEmpService {
	IEmp d=new EmpDAO();
	@Override
	public void addEmp(Emp emp) {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
			d.save(emp);
			trans.commit();
			session.close();
	}

	@Override
	public void editEmp(Emp emp) {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		d.update(emp);
		trans.commit();
		session.close();
	}

	@Override
	public void deleteEmp(Emp emp) {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		d.delete(emp);
		trans.commit();
		session.close();
	}
	

	@Override
	public Emp getEmpByEmpno(Integer empno) {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		Emp dd=d.findOne(empno);
		trans.commit();
		return dd;
	}

	@Override
	public List<Emp> getAllEmps() {
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		List<Emp> dd=d.findAll();
		trans.commit();
		return dd;
	}

}

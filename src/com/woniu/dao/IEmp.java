package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Emp;

public interface IEmp {
	void save(Emp emp);
	void delete(Emp emp);
	void update(Emp emp);
	Emp findOne(Integer empno);
	List<Emp> findAll();
}

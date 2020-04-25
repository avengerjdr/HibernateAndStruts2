package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;
import com.woniu.pojo.Emp;

public interface IDeptService {
	void addDept(Dept dept);
	void editDept(Dept dept);
	void deleteDept(Dept dept);
	Dept getDeptByDeptno(Integer did);
	List<Dept> getAllDepts();
}

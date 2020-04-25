package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Emp;

public interface IEmpService {
	void addEmp(Emp emp);
	void editEmp(Emp emp);
	void deleteEmp(Emp emp);
	Emp getEmpByEmpno(Integer empno);
	List<Emp> getAllEmps();
}

package com.woniu.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.woniu.pojo.Dept;
import com.woniu.pojo.Emp;
import com.woniu.service.IEmpService;
import com.woniu.service.impl.EmpService;

public class EmpTest {
	IEmpService e=new EmpService();
	@Test
	public void save() {
		Emp emp=new Emp();
		emp.setEname("11");
		e.addEmp(emp);
	}
	@Test
	public void delete() {
		Emp emp=new Emp();
		emp.setEmpno(8003);;
		e.deleteEmp(emp);
	}
	@Test
	public void update() {
		Emp emp=new Emp();
		emp.setEname("11");
		emp.setEmpno(8002);
		emp.setComm(8888d);
		
		e.editEmp(emp);
	}
	@Test
	public void findAll() {
		List<Emp> list=e.getAllEmps();
		for(Emp dep:list) {
			System.out.println(dep);
		}
	}
	@Test
	public void findOne() {
		Emp list=e.getEmpByEmpno(1111);
		System.out.println(list);
	}

}

package com.woniu.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
import com.woniu.service.impl.DeptService;

public class DeptTest {
	IDeptService d=new DeptService();
	@Test
	public void save() {
		Dept dd=new Dept();
		dd.setDname("dnamssss");
		dd.setLoc("dloc");
		d.addDept(dd);
	}
	@Test
	public void delete() {
		Dept dept=new Dept();
		dept.setDeptno(114);
		d.deleteDept(dept);
	}
	@Test
	public void findAll() {
		List<Dept> list=d.getAllDepts();
		for(Dept dep:list) {
			System.out.println(dep);
		}
	}
	@Test
	public void findOne() {
	Dept list=d.getDeptByDeptno(20);
		
	System.out.println(list);}
}

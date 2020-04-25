package com.woniu.action;

import java.util.List;

import com.woniu.pojo.Dept;
import com.woniu.pojo.Emp;
import com.woniu.service.IDeptService;
import com.woniu.service.IEmpService;
import com.woniu.service.impl.DeptService;
import com.woniu.service.impl.EmpService;

public class EmpAction {
	IEmpService es=new EmpService();
	IDeptService ds=new DeptService();
	Emp emp;
	Dept dept;
	List<Dept> depts;
	List<Emp> emps;
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public String save() {
		es.addEmp(emp);
		return "empList";
	}
	public String delete() {
		es.deleteEmp(emp);
		return "empList";
	}
	public String update() {
		es.editEmp(emp);
		return "empList";
	}
	public String findOne() {
	emp=	es.getEmpByEmpno(emp.getEmpno());
	depts=ds.getAllDepts();
	emps=es.getAllEmps();
		return "success";
		
	}
	public String findAll() {
		emps=es.getAllEmps();
		return "showempList";
	}
	public String addform() {
		emps=es.getAllEmps();
		depts=ds.getAllDepts();
		return "addform";
	}
	
}

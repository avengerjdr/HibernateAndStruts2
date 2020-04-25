package com.woniu.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Dept;
import com.woniu.pojo.Emp;
import com.woniu.service.IDeptService;
import com.woniu.service.IEmpService;
import com.woniu.service.impl.DeptService;
import com.woniu.service.impl.EmpService;


//@Namespace("/")
//@Results({
//	@Result(name="showDept",type="redirect",location = "/deptList.jsp")
//})
public class DeptAction extends ActionSupport{
	IDeptService ds=new DeptService();
	IEmpService  es=new EmpService();
	private Dept dept;
	Emp emp;
	List<Emp> emps;
	private List<Dept>  depts;
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
	public String save() {
		ds.addDept(dept);
		return "DreturnList";
		
	}
	public String delete() {
		emps=es.getAllEmps();
		for(Emp aa :emps) {
			System.out.println(aa);
			if(aa.getDept().getDeptno()==dept.getDeptno()) {
				es.deleteEmp(aa);
			}
		}
		//ds.deleteDept(dept);
		return "DreturnList";
		
	}
	public String update() {
		ds.editDept(dept);
		return "DreturnList";
		
	}
	public String findOne() {
		dept=ds.getDeptByDeptno(dept.getDeptno());
		return "Dsuccess";
		
	}
	//@Action("/show")
	// @Action(value="mod", results={@Result(name="showDept", location="/deptList.jsp")})
	public String findAll() {
		depts=ds.getAllDepts();
		return "showDept";
		
	}
	
}

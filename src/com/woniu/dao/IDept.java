package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDept {
	void save(Dept dept);
	void delete(Dept dept);
	void update(Dept dept);
	Dept findOne(Integer deptno);
	List<Dept> findAll();
}

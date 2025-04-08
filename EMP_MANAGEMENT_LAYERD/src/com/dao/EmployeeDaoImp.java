package com.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.model.Employee;

public class EmployeeDaoImp implements EmployeeDao{

	HashMap<Integer,Employee> hasMap = new HashMap<Integer,Employee>(); //its database
	int empid=300;  //auto increment every time
	
	
	@Override
	public int addEmployee(Employee emp) {
  
		hasMap.put(++empid, emp);
		return empid;
	}

	@Override
	public Employee updateEmployee(int empid, Employee emp) {
		Employee empobj=hasMap.put(empid, emp);
		return empobj;
	}

	@Override
	public Employee getEmployee(int empid) {
		Employee getemp=hasMap.get(empid);
		return getemp;
	}

	@Override
	public String deleteEmployee(int empid) {
		hasMap.remove(empid);
		return "employee deleted successfully :"+empid;
	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployees() {
		Set <Entry <Integer, Employee>> result=hasMap.entrySet();
		return result;
	}	
}

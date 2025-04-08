package com.controller;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImp;

public class Client {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImp();
		
		while(true)
		{
		System.out.println("---employee management application---");
		System.out.println("1.Add Employee");
		System.out.println("2.update employee");
		System.out.println("3.get employee");
		System.out.println("4.delete employee");
		System.out.println("5.get all employee");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the any one option :");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			
			System.out.println("enter employee name :");
			String name=sc.next();
			System.out.println("enter employee sal");
			int salary=sc.nextInt();
			System.out.println("enter employee address");
			String add=sc.next();
			System.out.println("enter employee mail id");
			String mail=sc.next();
			
			Employee emp=new Employee(name,salary,add,mail);
			int empid=service.addEmployee(emp);
			System.out.println("employee inserted :"+empid);
					
			break;
		case 2:
			System.out.println("enter employee id");
			int eid=sc.nextInt();
			System.out.println("enter employee name :");
			String ename=sc.next();
			System.out.println("enter employee sal");
			int esalary=sc.nextInt();
			System.out.println("enter employee address");
			String eadd=sc.next();
			System.out.println("enter employee mail id");
			String email=sc.next();
			
			Employee emp1= new Employee(ename,esalary,eadd,email);
			Employee emobj=service.updateEmployee(eid, emp1);
			System.out.println(emobj);
			break;
		case 3:
			System.out.println("enter employee id");
			int eid2=sc.nextInt();
			
			Employee getEmp=service.getEmployee(eid2);
			System.out.println(getEmp);
			
			break;
		case 4:
			System.out.println("Employee id to delete");
			int eid3=sc.nextInt();
			String delemp=service.deleteEmployee(eid3);
			System.out.println(delemp);
			break;
		case 5:
			Set <Entry <Integer, Employee>> result=service.getAllEmployees();
			Iterator <Entry <Integer, Employee>>itr=result.iterator();
			while(itr.hasNext())
			{
				Entry<Integer,Employee> finalresult=itr.next();
				System.out.println(finalresult.getKey()+" "+finalresult.getValue());
			}
			
			break;
		default:
			System.out.println("enter valid option ");
			break;
		}
		}
	}
}

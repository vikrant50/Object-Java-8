package com.Employee.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee
{
  @Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge + ", empCompany="
				+ empCompany + "]";
	}
public Employee(String empName, double empSalary, int empAge, String empCompany) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
		this.empCompany = empCompany;
	}
public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpCompany() {
		return empCompany;
	}
	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}
private String empName;
  private double empSalary;
  private int empAge;
  private String empCompany;
}
public class EmployeeTest {

	public static void main(String[] args) 
	{
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("rmit", 27000, 25, "Capgemini"));
		list.add(new Employee("aahul", 19000, 19, "TCS"));
		list.add(new Employee("amit", 21000, 14, "TCS"));
		list.add(new Employee("robu", 18000, 34, "Capgemini"));
		list.add(new Employee("robu", 18000, 34, "Capgemini"));
		list.add(new Employee("aahul", 18000, 34, "Capgemini"));
		list.add(new Employee("aahul", 18000, 34, "Capgemini"));
	
		Collections.sort(list,Comparator.comparing(Employee::getEmpSalary));
		
		for(Employee e:list)
		{
			System.out.println(e.getEmpName());
		}
	}
}

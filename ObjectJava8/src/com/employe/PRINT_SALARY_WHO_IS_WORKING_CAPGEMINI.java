package com.employe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", company=" + company + "]";
	}
	public Employee(String name, double salary, String company) {
		super();
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	String name;
	double salary;
	String company;
	
}
public class PRINT_SALARY_WHO_IS_WORKING_CAPGEMINI {

	public static void main(String[] args)
	{
		ArrayList<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee("amit", 2321, "capgemini"));
		employees.add(new Employee("rahul", 1200, "kpit"));
		employees.add(new Employee("rahul", 12300, "kpit"));
		employees.add(new Employee("vinod",3100, "infosys"));
		employees.add(new Employee("bharat", 3221, "capgemini"));	
	
	 
		List<Employee> f=employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
	
		System.out.println(f);
	
	}

}

package com.second.highest.salay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Employ
{
  @Override
	public String toString() {
		return "Employ [Firstname=" + Firstname + ", salary=" + salary + ", age=" + age + ", lasname=" + lasname + "]";
	}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLasname() {
	return lasname;
}
public void setLasname(String lasname) {
	this.lasname = lasname;
}
public Employ(String firstname, double salary, int age, String lasname) {
		super();
		Firstname = firstname;
		this.salary = salary;
		this.age = age;
		this.lasname = lasname;
	}
private String Firstname;
  private double salary;
  private int age;
  private String lasname;
  
}
public class EMPLOYEEJAVA8 
{
	public static void main(String[] args)
	{
	//	
	List<Employ> empl=new ArrayList<Employ>();	
	empl.add(new Employ("babu", 40000.00, 25, "sing"));
	empl.add(new Employ("khageshwar", 30000.00, 10, "sahing"));
	empl.add(new Employ("calu", 9900.00, 35, "sing"));
	empl.add(new Employ("rahul", 5000.00, 15, "gupta"));
	empl.add(new Employ("rohit", 4000.00, 46, "raj"));
	
	//find the name only  whose salary is 2nd highest 
	Employ lis=empl.stream().sorted(Comparator.comparingDouble(Employ::getSalary).reversed()).skip(1).findFirst().orElse(null);
	System.out.println(lis);
    
	//find the second highest salary (here this way we can find maximum ,2nd ,3rd)
	List<Employ> ss = empl.stream().sorted(Comparator.comparingDouble(Employ::getSalary).reversed()).collect(Collectors.toList());
	System.out.println(ss.get(1));
	

	}
}
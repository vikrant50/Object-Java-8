package com.employe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employ
{
	private String name;
	private int age;
	
	public String getName() 
	{
		return name;
	}
	public Employ(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + ", age=" + age + "]";
	}
	public void setName() {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Practice
{

	public static void main(String[] args) 
	{
	  
		List<Employ> list=new ArrayList<>();
		
		list.add(new Employ("rahul", 39));
		list.add(new Employ("ahanu", 34));
		list.add(new Employ("sanu", 50));
		list.add(new Employ("rahul", 40));
		
	
	 List<Employ> collect = list.stream().sorted().filter(n->"rahul".equals(n.getName())).collect(Collectors.toList());
	 System.out.println(collect);
	}
	}

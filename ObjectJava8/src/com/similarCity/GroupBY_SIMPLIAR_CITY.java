package com.similarCity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 Employee has two field name and city
 there is a list of employees with below details
 you need to group by employee with the city
 
 input:-
     Name= Aman city=pune
     Name=Amit city =pune
     Name=neha city = mumbai
     Name= samc city=mumbai
 Output:-
 Pune= Aman,Amit
 Mumbai=Neha ,samc    
 */

class Employe
{
   @Override
	public String toString() {
		return "Employe [name=" + name + ", city=" + city + "]";
	}
public Employe(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
private String name;
   private String city;
}
public class GroupBY_SIMPLIAR_CITY
{

	public static void main(String[] args)
	{
		Employe e1=new Employe("Aman", "pune");		 
		Employe e2=new Employe("Aman", "pune");		 
		Employe e3=new Employe("Amit", "pune");		 
		Employe e4=new Employe("Neha", "mumbai");		 
		Employe e5=new Employe("samc", "mumbai");
		Employe e6=new Employe("samc", "mumbai");
		Employe e7=new Employe("Subham", "Banglore");
	
		
		List<Employe> employees=Arrays.asList(e1,e2,e3,e4,e5,e6,e7);		
		Map<String,List<Employe>> groupedBy=employees.stream().collect(Collectors.groupingBy(Employe::getCity));
		System.out.print(groupedBy);
		


	}

}

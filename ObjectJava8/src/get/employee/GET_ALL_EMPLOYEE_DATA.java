package get.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/*
 Ques1.How many male and femal employee are there in organization
 Ques2.Print the name of all department in the organization
 Ques3.print all the employee name
 Ques4:- Print all the employee name by sorted order
 */
class EmployeeClass
{
	private int id;
	public EmployeeClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeClass(int id, String name, int age, String gender, String department, int yearsOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearsOfJoining = yearsOfJoining;
		this.salary = salary;
	}
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearsOfJoining() {
		return yearsOfJoining;
	}
	public void setYearsOfJoining(int yearsOfJoining) {
		this.yearsOfJoining = yearsOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private int age;
	private String gender;
	private String department;
	private int yearsOfJoining;
	private double salary;
	@Override
	public String toString() {
		return "EmployeeClass [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearsOfJoining=" + yearsOfJoining + ", salary=" + salary + "]";
	}
 	
}
public class GET_ALL_EMPLOYEE_DATA
{
	public static void main(String[] args)
	{
		List<EmployeeClass>  Employees=new ArrayList<EmployeeClass>();
		 Employees.add(new EmployeeClass(111, "jiyan breain", 72, "female", "hr", 2011, 26903.34));
		 Employees.add(new EmployeeClass(111, "bahi", 36, "male", "IT", 2011, 26903.34));
		 Employees.add(new EmployeeClass(111, "kumari sangita", 32, "female", "hr", 2011, 26903.34));
		 Employees.add(new EmployeeClass(111, "ankita", 32, "male", "hr", 2011, 26903.34));
		 Employees.add(new EmployeeClass(111, "adha", 42, "female", "hr", 2011, 26903.34));
		 Employees.add(new EmployeeClass(111, "sita", 32, "male", "hr", 2011, 26903.34));
		 Employees.add(new EmployeeClass(111, "ram", 23, "female", "hr", 2011, 26903.34));
		 Employees.add(new EmployeeClass(111, "indra", 92, "male", "hr", 2011, 26903.34));
		 Employees.add(new EmployeeClass(111, "rahul", 12, "female", "hr", 2011, 26903.34));
		 
		 //Q1.FIND THE MALE AND FEMALE EMPLOYEE
          Map<String, Long> collect = Employees.stream().collect(Collectors.groupingBy(EmployeeClass::getGender,Collectors.counting()));
         System.out.println(collect);
         
         
        
         
		 //QUES2 : Print the name of all department in the organization
		List<String> collect3 = Employees.stream().map(e->e.getDepartment()).collect(Collectors.toList());
		 System.out.println(collect3);
		 
		 
		 //quest 3:- print all the employee name 
		List<String> collect2 = Employees.stream().map(EmployeeClass::getName).collect(Collectors.toList());
        System.out.println("THIS IS MY EMP NAME:-"+collect2);
      
	    //Ques3:- Print all the employee name by sorted order
		Employees.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).
		forEach(s->System.out.println(s.getName()));
		
		
		
		
	
		
	}

}

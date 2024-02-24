package com.java8.products;
/*

 we need to write java 8 code to find all the product which are having book category 
 we need to make sure that product price should be greater that 200
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass
{

	public static void main(String[] args)
	{
		Product p1=new Product(101,"JAVA","Books",100);
		Product p2=new Product(102,"SPRING","Books",980);
		Product p3=new Product(103,"CSS","Books",100);
		Product p4=new Product(104,"Html","Books",220);		                                                                                                                                                                                                                                                                                                                             		
		Product p5=new Product(105,"Nokia","Phone", 300);
		Product p6=new Product(106,"Apple","Phone", 150);
		Product p7=new Product(107,"Samsung","Phone", 2500);
		Product p8=new Product(108,"PYTHON" ,"Books",712);
		Product p9=new Product(108,"PYTHON" ,"Books",322);
		Product p10=new Product(108,"PYTHON" ,"Books",512);
		
		
        //create list by using list product which takes all the product as parameter or input
	     List<Product> products=Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
	     
    	  //we need to write java 8 code to find all the product which are having book category we need to make sure that product price should be 200 
         //products.stream().filter(p->p.getCategory().equalsIgnoreCase("Books"))
        //.filter(p->p.getPrice()>200).collect(Collectors.toList()).forEach(System.out::println);
	       products.stream().filter(p->p.getCategory().equalsIgnoreCase("books")).filter(b->b.getPrice()>300).collect(Collectors.toList()).forEach(System.out::println);
	
	       List<Product> collect = products.stream().filter(n->n.getName().equalsIgnoreCase("Python")).filter(n->n.getPrice()>300 && n.getPrice()<600).collect(Collectors.toList());
	
	       System.out.println(collect);
	}

}

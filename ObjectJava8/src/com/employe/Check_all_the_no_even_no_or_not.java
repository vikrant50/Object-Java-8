package com.employe;

import java.util.Arrays;
import java.util.List;

public class Check_all_the_no_even_no_or_not {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(21,4,6,81);
		
		Boolean status=list.stream().allMatch(n->n%2==0);
		
		if(status==true)
		{
			System.out.println("All the no is even no");
		}
		else
		{
			System.out.println("No is not even no");
		}

	}

}

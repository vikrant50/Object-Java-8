package com.employe.phoneNostartWithPlus91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Em
{
	@Override
	public String toString() {
		return "Em [mobileno=" + mobileno + "]";
	}
	public Em(String mobileno) {
		super();
		this.mobileno = mobileno;
	}
	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) 
	{
		this.mobileno = mobileno;
	}
	private String mobileno;
}

public class Scanner1
{
	public static void main(String[] args) 
	{
		List<Integer> map = Arrays.asList(12,32,34,53,13);
		List<Em> list = new ArrayList<>();
		list.add(new Em("+9171864872"));
		list.add(new Em("+271864872"));
		list.add(new Em("+9371864872"));
		list.add(new Em("+9171864872"));
		
		List<String> k=list.stream().map(Em::getMobileno).filter(n->n.startsWith("+91")).collect(Collectors.toList());
        System.out.println(k);
            
      list.stream().map(Em::getMobileno).filter(n->n.startsWith("+27")).collect(Collectors.toList());
	}
}
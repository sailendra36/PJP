package com.subho.wipro.pjp.tm04.annotations.Assignment01;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {
	Employee e = new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Ajay");
		list.add("Vijay");
		list.add("Suresh");
	}
	
	@Test
	public void testFindName() {
		System.out.println(list);
		assertEquals("FOUND", e.findName(list, "Ajay"));
		System.out.println("tested");
	}

}

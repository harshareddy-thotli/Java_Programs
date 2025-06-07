package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class HashSetOperation {

	public static void main(String[] args) {
		
		Set<Emp> employee = new HashSet<Emp>();
		
		Emp emp1 = new Emp(1, "AAA");
		Emp emp2 = new Emp(2, "BBB");
		Emp emp3 = new Emp(2, "BBB"); //it internally uses hashcode and equals for comparing two values
		
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		
		System.out.println(employee);
		
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(null);
		nums.add(null);
		nums.add(null);
		
		System.out.println(nums);
		
		
	}	
	
}

class Emp{
	
	int id;
	String name;
	
	public Emp() {
		
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}

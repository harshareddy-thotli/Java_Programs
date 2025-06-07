package com;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList li = new ArrayList();
		li.add(10);
		li.add(25.0);
		li.add(false);
		li.add("Hari");
		li.add("Hari");
		li.add(new Employee("Harish", 50));
		li.add(1,20); //(index,parameter) it store 20 at 1 index. all other values get re shuffled - moves right by 1 index
		li.set(1, 30); //it will replace the value with new value at 1 index
		li.remove(1); //it will remove from index 1- it will also re shuffle all the values left by 1 index
		li.add(null);
		li.add(null); //we can add number of null values to arrayList
		
		System.out.println(li); 
		System.out.println(li.size()); //4 - but internally it has 10
		
		System.out.println(li.get(0)); //get data by indexing
		
		ArrayList a2 = new ArrayList();
		
		System.out.println(a2.isEmpty()); //true
		System.out.println(li.isEmpty());  //false
		
		
		System.out.println(li.contains("Hari")); //true
		System.out.println(li.indexOf("Hari")); //if the list contains multiple values it will return first possible index
		System.out.println(li.lastIndexOf("Hari"));
		
		a2.addAll(li); //all the data present in li is added to a2
		System.out.println(a2);
		System.out.println(li.get(5));
		
		li.clear(); //it will clear all the data in the list
		System.out.println(li); //[] - empty list
		System.out.println(li.isEmpty()); //true
		System.out.println(li.size()); //0
		
		//GENERICS
		ArrayList<Integer> numbers = new ArrayList<Integer>();  //we use generics to give data type <>
		numbers.add(10);
		//number.add("Hari") you can only add Integers
		
		ArrayList<Employee> employees = new ArrayList<Employee>(); //
		employees.add(new Employee("siri",10));
		employees.add(new Employee("giri",20));
		System.out.println(employees);
		System.out.println(employees.get(0).getName());
		
		
		//ITERATION
		for(int i = 0 ; i <employees.size(); i++) {
			System.out.println(employees.get(i));
		}
		
	}

}

class Employee{
	
	String name;
	
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
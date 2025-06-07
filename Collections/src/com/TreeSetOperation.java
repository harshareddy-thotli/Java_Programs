package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperation {

	public static void main(String[] args) {
		
		//Treeset 
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(4);
		nums.add(12);
		
		System.out.println(nums);
		
		//Hashset
		
		Set<Integer> num1 = new HashSet<Integer>();
		num1.add(10);
		num1.add(20);
		num1.add(4);
		num1.add(12);
		
		System.out.println(num1);
		
		//Treeset(string)
		
		Set<String> names = new TreeSet<String>();
		names.add("ABC");
		names.add("BBB");
		names.add("abc7");
		
		System.out.println(names);
		
		//Linked Hash Set
		Set<Integer> numsLinked = new LinkedHashSet<Integer>();
		numsLinked.add(10);
		numsLinked.add(20);
		numsLinked.add(4);
		numsLinked.add(12);
		numsLinked.add(20);
		
		System.out.println(numsLinked);
		
	}

}

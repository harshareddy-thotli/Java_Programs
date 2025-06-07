package com;

import java.util.HashSet;
import java.util.Iterator;

public class SetOperation {

	public static void main(String[] args) {
		
		HashSet<Integer> nums = new HashSet<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(20); //set doesn't allow duplicates
		//nums.get(0) // we cannot access the values using index in set
		
		System.out.println(nums.size());
		
		System.out.println(nums);
		
		for(Integer num : nums) {
			
			System.out.println(num);
		}
		
		System.out.println("-------Iterator---------");
		
		Iterator<Integer> iterator = nums.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
	}

}

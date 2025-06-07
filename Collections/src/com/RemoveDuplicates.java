package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(10,10,20,25));
		System.out.println(nums);
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		Iterator<Integer> iterator = nums.iterator();
		
		for(Integer num : nums) {
			if(!newList.contains(num)) {
				newList.add(num);
			}
		}
	
		System.out.println(newList);		
	}

}

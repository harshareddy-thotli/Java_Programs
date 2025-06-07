package com;

import java.util.Scanner;

public class ThrowsKeyword {
	
	 public static void main(String[] args) {
		 
		 try(Scanner sc = new Scanner(System.in)){
			 
			 System.out.println("Enter your Experience : ");
			 int experience = sc.nextInt();
			 NotEligibleException(experience);
		 }
		 catch(NotEligibleException e) {
			 System.out.println(e.getMessage());
		 }
		
	 }
	 
	 public static void NotEligibleException(int experience) throws NotEligibleException  {
		 
		 if (experience < 5) {
	            throw new NotEligibleException("You are not eligible for this job.");
	        } else {
	            System.out.println("You are eligible.");
	        }
	 }
}

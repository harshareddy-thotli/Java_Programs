package com;

import java.util.Scanner;

public class ExceptioTest {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		try(Scanner sc = new Scanner(System.in);) {  //try-with-resources block, which is used for auto-closing resources (like Scanner) 
			
			System.out.println("Enter your experince : ");
			int experience = sc.nextInt();
			
			if(experience < 5) {
				throw new NotEligibleException("You are not eliginble for this Job opportunity");
				
			}
			else {
				System.out.println("You are eligible");
			}
			
		}
		catch(NotEligibleException e) {
			System.out.println(e);
		}
		
	}

}

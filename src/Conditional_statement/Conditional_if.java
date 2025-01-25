package Conditional_statement;

import java.util.Scanner;

public class Conditional_if {
public static void main(String[]args) {
/*	//example 1
	int Person_age =25; 
	if(Person_age>=18) {
		System.out.println("The persopn is elgible to vote"); //it return the statement
	}
	
	//example 2
	int Person_age =15;
 if(Person_age>=18){
 System.out.println("The person is not elgible");   // it does not return any result because the condition is false
  }
 */
	//Write a program to check if a number entered by the user is positive.
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num;
	 num = sc.nextInt();
	 sc.close();
	if(num>0) {
		System.out.println("User entered number is positive");
	}
	
}
}

package Conditional_statement;

import java.util.Scanner;

public class lergest_number_ifelse_ladder {

	public static void main (String [] args) {
	/*	int a=10, b=70, c=30;
		if (a>b && a>c) {
			System.out.println("Largets number is a");
		}
		else if (b>a && b>c) {
			System.out.println("Largest number is b");
		}else 
		{
			System.out.println("Largest number is c");
		}*/
		
		
		//getting numbers from users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value");
		int c = sc.nextInt();
		sc.close();
		if(a>b && a>c) {
			System.out.println("Largest number is A");
		}else if(b>a && b>c) {
			System.out.println("Largest number is B");
		}else if (c>a && c>b){
			System.out.println("Largest number is c");
		} else {
			System.out.println("The numbers are equal");
		}
	}
}

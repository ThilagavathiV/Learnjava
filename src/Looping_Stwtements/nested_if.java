package Looping_Stwtements;

public class nested_if {
public static void main (String [] args) {
	//example1 
	for(int i=1; i<=5; i++) {
		System.out.println("Multiplication table of " + i);
	
	for(int j=1; j<=10;j++) {
		
		System.out.println(j + "X" + i+ "=" + (i*j));
	}
	System.out.println(); 
}
}}

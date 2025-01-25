package Conditional_statement;

public class if_else_ladder {
public static void main(String []args) {
	int num = 13;
	if(num%2<0)
	{
		System.out.println("The number is positive");
	} else if (num%2>0)
	{
		System.out.println("The number is negative");
	}else if(num%2==0)
	{
		System.out.println("The number is zero");
	}else
	{
		System.out.println("Not above the all scenarioes");
	}
}
}
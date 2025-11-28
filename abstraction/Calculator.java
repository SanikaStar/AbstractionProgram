package abstraction;

public abstract class Calculator {
	String brand="Casio";
	
	public Calculator()
	{
		
	}
	public abstract void addition(int n1,int n2);
	
	public abstract void substraction(int n1,int n2);
	public abstract void division(double num1,double num2);
//	{
//		System.out.println(num1/num2);                             
//		
//	}
	public abstract void multiplication(int n1,int n2);
	
}



package assignment5;

public class Factorial {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=6;
	long factorial=calculatefactorial(number);
	System.out.println("factorial of number:"+number+"="+factorial);
	}
public static long calculatefactorial(int number)
{
	 if(number==0)
	{
		return 1;
	}
	else if(number==1)
	{
		return 1;
	}
	else 
	{
		long factorial=1;
		for(int i=2;i<=number;i++)
		{
			factorial*=i;
		}
		return factorial;
		}}}	


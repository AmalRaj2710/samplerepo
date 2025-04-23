package assignment5;

public class Palindrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=122;
if (palindrome(num))
{
	System.out.println(num +" is a palindrome");
	
}
else
{
	System.out.println(num +" is not a palinrome");
}
	}
	public static int reversenumber(int num)
	{
		int reverse=0;
		while(num!=0)
		{
		int rem=num%10;
		reverse=reverse*10+rem;
		num =num/10;
		}
		return reverse;
		}
public static boolean palindrome(int num)
{
	return num==reversenumber(num);
}
}

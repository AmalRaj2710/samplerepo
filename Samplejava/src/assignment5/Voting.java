package assignment5;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=11;
if(voting(age))
{
	System.out.println("person is eligible for voting");
}
else
{
	System.out.println("person not eligible for voting");
}
	}
public static boolean voting(int age)
{
	return age>=18;
}
}

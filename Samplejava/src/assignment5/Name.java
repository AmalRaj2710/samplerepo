package assignment5;

public class Name {
	static int a;
	static String n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name obj=new Name(23,"Amal");
    Name.display();

	}
	public Name(int age,String name)
	{
		 n=name;
		 a=age;
	}
	public static void display()
	{
		System.out.println(n);
		System.out.println(a);
	
	}
}

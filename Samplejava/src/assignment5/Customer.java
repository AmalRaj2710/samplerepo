package assignment5;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
public static double price(double item1,double item2,double item3)
{
	double list[]= {item1,item2,item3};
	return list;
}
public static double total(double price])
{
	double totalprice=0;
	for(int i=0;i<price.length;i++)
	{
		totalprice=totalprice+price[i];
	}
	return totalprice;
}
	public static void discount(double total)
	{
		if(total>=5000)
		{
			System.out.println("get 20%Discount");
		
		}
		else
		{
			System.out.println("not get 20% Discount");
		}
}
}

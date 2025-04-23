package assignment5;

public class Customer1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalamount=calculatetotalamount(1000,7);
	double discount=calculatediscount(totalamount);
		double finalamount=calculatefinalamount(totalamount,discount);

System.out.println("total Amount:"+totalamount);
System.out.println("discount:"+discount);
System.out.println("final amount:"+finalamount);
	}
	public static double calculatetotalamount(double price,int quantity)
	{
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);	
 return price*quantity;
	}
	public static double calculatediscount(double totalamount)
	{
		if (totalamount>5000) {
			return totalamount*0.2;	}
		else
		{
			return 0;
		}}
	public static double calculatefinalamount(double totalamount,double discount)
	{
	return totalamount-discount;
	}}

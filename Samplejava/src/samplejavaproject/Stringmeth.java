package samplejavaproject;

public class Stringmeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stringmeth obj=new Stringmeth();
obj.empty();
	}
 public  void empty()
{
String str1="";
String str2="Hello";
System.out.println(str1.isEmpty());
System.out.println(str2.isEmpty());
this.replace();
}
 public  void replace()
{

String str2=" india is my country";
System.out.println(str2.replace("my", "our"));
this.equal();
}
 public  void equal()
{
String str1="Hello";
String str2="Hello";
String str3="world";
System.out.println(str1.equals(str2));
System.out.println(str2.equals(str3));
this.length();
}
 public  void length()
{
String str1="Hello";
System.out.println(str1.length());
this.value();
}
 public  void value()
 {
 String str1="Hello";
 System.out.println(str1.valueOf(str1));
}
}
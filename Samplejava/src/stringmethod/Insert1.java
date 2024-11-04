package stringmethod;

public class Insert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("hello");
		s.insert(5, " world");
		System.out.println(s);
		Insert1.buildercls();
	}
	
	public static void buildercls()
	{
		StringBuilder s=new StringBuilder("hello");
		s.insert(5, " world");
		System.out.println(s);
	}

}

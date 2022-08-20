package javaPrograms;

class over
{
	void Override(int a,int b)
	{
		System.out.println(a+b);
	}
}
public class methodOverriding extends over {
	void Override(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverriding m=new methodOverriding();
		m.Override(3,2);
	}

}

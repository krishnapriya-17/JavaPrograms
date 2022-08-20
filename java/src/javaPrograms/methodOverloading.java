package javaPrograms;

public class methodOverloading {

	void overLoad()
	{
		System.out.println("Empty Method");
	}
	void overLoad(int a,int b)
	{
		
		System.out.println(a+b);
	}
	void overLoad(String x,String y)
	{
		System.out.println(x+y);
	}
	
	void overLoad(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void overLoad(float a,float b)
	{
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading m=new methodOverloading();
		m.overLoad();
		m.overLoad(3,2);
		m.overLoad("Krishna","Priya");
		m.overLoad(3,2,7);
		m.overLoad(3.0f,2.1f);

		
	}

}

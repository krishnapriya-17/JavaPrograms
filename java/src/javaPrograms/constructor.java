package javaPrograms;

public class constructor {

	constructor()
	{
		System.out.println("Constructor Method");
	}
	void noConstructor()
	{
		System.out.println("noConstructor Method");
	}
	void parameterConstructor(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c=new constructor();
		c.noConstructor();
		c.parameterConstructor(3,2);
	}

}

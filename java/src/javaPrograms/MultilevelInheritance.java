package javaPrograms;

class B
{
	void Multi1()
	{
		System.out.println("Print B Class");
	}
}


class C extends B
{
	void Multi2()
	{
		System.out.println("Print C Class");
	}
}

public class MultilevelInheritance extends C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance m=new MultilevelInheritance();
		
	   m.Multi1();
	   m.Multi2();
	}

}

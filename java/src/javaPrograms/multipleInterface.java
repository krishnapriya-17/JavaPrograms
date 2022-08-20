package javaPrograms;

interface AB
{
	void interfaceMethod();
}
interface BC
{
	void interfaceMethod2();
}

public class multipleInterface implements AB,BC {


	@Override
	public void interfaceMethod() {
		System.out.println("InterfaceMethod");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void interfaceMethod2() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceMethod2");

	}
	public static void main(String[] args) {
		
		multipleInterface m= new multipleInterface();
		m.interfaceMethod();
	}

	


}

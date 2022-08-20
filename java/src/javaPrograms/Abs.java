package javaPrograms;

abstract class abstra {
	void normalmethod()
	{
		System.out.println("Normal Method");
	}
	
	abstract void abstractMethod();
	
	}
class Abs extends abstra {

	 @Override
		void abstractMethod() {
          System.out.println("Abstract Method");			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abs n= new Abs();
		n.normalmethod();
		n.abstractMethod();
	
	}

	
	
}

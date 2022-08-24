package javaPrograms;

public class Encapsulation {

	private String name;
	
		// TODO Auto-generated method stub
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

 }
	 class testEncapsulation  
{
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
e.setName("Priya");
System.out.println(e.getName());
}
}


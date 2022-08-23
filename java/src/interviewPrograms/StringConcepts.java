package interviewPrograms;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Krishna priya";
		String name1="Krishna Priya";
		String Dname="Baranitharan";
		for(int i=0;i<name.length();i++)
		{
		System.out.print(name.charAt(i)+ " "); //charAt
		}
		System.out.println();
		System.out.println(name.compareTo(Dname));
		String combinedName=name.concat(Dname); 	//concat
		System.out.println(combinedName);
		boolean containscheck=name.contains("priya"); //contains
		System.out.println(containscheck);
		boolean equalscheck=name.equals(name1); //equals
		System.out.println(equalscheck);
		boolean equalsIgnoreCasecheck=name.equalsIgnoreCase(name1);//equalsIgnorecase
		System.out.println(equalsIgnoreCasecheck);
		boolean startswithcheck=name.startsWith("Kr");//startswith
		System.out.println(startswithcheck);
		
		boolean endswithcheck=name.endsWith("ya");//ends with
		System.out.println(endswithcheck);
		String Bnam=" Naveenkumar";
		System.out.println(Bnam);
		System.out.println(Bnam.trim()); //trim
		int a=17;
		String n=String.valueOf(a);
		System.out.println(name+n);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.substring(1));
		System.out.println(name.substring(2, 5));
		char a1[]=name.toCharArray();
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();

		String name2=name.replace("a","A" );
		System.out.println(name2);
		String name3=name.replaceAll("a","A" );
		System.out.println(name3);
		int len=name.length();
		System.out.println(len);
		System.out.println(name.indexOf(4));



		
		
		

		
		
		
		
	}

}

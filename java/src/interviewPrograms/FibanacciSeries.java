package interviewPrograms;

import java.util.Iterator;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//0 1 1 2 3 5 8 13 21 34
		int n1=0,n2=1,count=10;
		System.out.print(n1 +" "+n2);
		for(int i=2;i<count;i++)
		{
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		

	}

}

package interviewPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeNo=12;
		boolean flag=false;
		for(int i=2;i<=primeNo/2;i++)
		{
			if(primeNo%i==0)
			{
				flag=true;
				break;
			}
		}
		    if (!flag)
		        System.out.println("It is a prime number.");
		      else
		        System.out.println("It is not a prime number.");

		
	}

}

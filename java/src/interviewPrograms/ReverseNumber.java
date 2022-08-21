package interviewPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=234,remainder,sum=0;
	      int temp=number;
	      while(number>0)
	      {
	    	  remainder=number%10;
	    	  sum=(sum*10)+remainder;
	    	  number=number/10;
	      }
	    System.out.println("Reverse of a string "+sum);
	    
	}

}

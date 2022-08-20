package interviewPrograms;

public class PalindromeUsingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number=121,remainder,sum=0;
      int temp=number;
      while(number>0)
      {
    	  remainder=number%10;
    	  sum=(sum*10)+remainder;
    	  number=number/10;
      }
      if(temp==sum)
      {
    	  System.out.println("it is a palindrome");
    	  
      }
      else
      {
    	  System.out.println("it is not a palindrome");

      }
    		  
	}

}

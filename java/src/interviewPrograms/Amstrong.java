package interviewPrograms;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int number=370,remainder,sum=0;
	      int temp=number;
	      while(number>0)
	      {
	    	  remainder=number%10;
	    	  sum=sum+remainder*remainder*remainder;
	    	  number=number/10;
	      }
	      if(temp==sum)
	      {
	    	  System.out.println("it is amstrong");
	    	  
	      }
	      else
	      {
	    	  System.out.println("it is not amstrong");

	      }


	}

}

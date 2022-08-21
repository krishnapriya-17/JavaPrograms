package interviewPrograms;

public class FindSmallestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10,c=15;
		int temp;
		temp=a<b?a:b;
		int smallest=temp<c?temp:c;
		System.out.println(smallest);
	

	}

}

package interviewPrograms;

public class SwapTwoNumbersWithTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10,num2=20,temp;
		System.out.println("Before Swap "+num1);
		System.out.println("Before Swap "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swap "+num1);
		System.out.println("After Swap "+num2);
	}

}

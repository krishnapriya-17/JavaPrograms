package interviewPrograms;

public class FindLargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,10,5};
		int temp;
		for(int i=0;i<a.length;i++)
			
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" "); //descending order

		}
		System.out.println("\n"+a[0]);
		System.out.println(a[1]); //second largest
		System.out.println(a[2]); //third largest


	}

}

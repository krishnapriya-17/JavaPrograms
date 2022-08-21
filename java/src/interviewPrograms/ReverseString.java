package interviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="aunty",reverse="";
		for(int i=words.length()-1;i>=0;i--)
		{
			reverse=reverse+words.charAt(i);
		}
		System.out.println(reverse);
		

	}

}

package interviewPrograms;

public class CountVowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="This is my Darling";
		int vcount=0,ccount=0;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||
					sentence.charAt(i)=='o'||sentence.charAt(i)=='u')
			{
				vcount++;
			}
			else if((sentence.charAt(i)>='a'&&sentence.charAt(i)<='z')||(sentence.charAt(i)>='A'&&sentence.charAt(i)<='Z'))
			{
				ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
	}

}

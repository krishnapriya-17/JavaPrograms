package interviewPrograms;

public class StringBufferConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		StringBuffer s= new StringBuffer("Hello");
		s.append("World");   
		System.out.println(s);  //after append
		s.reverse();
		System.out.println(s);//after reverse
		s.insert(1, "Priya");
		System.out.println(s);//after insert
		s.delete(1, 6);
		System.out.println(s);//after delete
		s.replace(1, 3, "priya");
		System.out.println(s);//after replace
	}

}

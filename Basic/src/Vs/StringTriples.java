package Vs;

public class StringTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab scf hyu";
		s=s.replace(" ","");
		int mod=s.length()%3;

		for(int i=0;i<s.length();i+=3)
		{
			if(s.length()-mod==i)
				System.out.println(s.substring(i));
			else
				System.out.println(s.substring(i,i+3));
		}
		}
	}
		
		



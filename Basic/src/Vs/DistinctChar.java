package Vs;

public class DistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdfsgaabcs";
		int c=0;
		for(int i=0;i<s.length();i++){
			c=0;

			for(int j=0;j<s.length();j++){
				
			if(s.charAt(i)==s.charAt(j))
			{
				c++;
			}
			}
			if(c==1){
				System.out.println(s.charAt(i));
			}
		}
	}

}

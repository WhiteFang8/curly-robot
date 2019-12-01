package Vs;

public class StringSuffics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="king beinng minng sinng";
		String s[]=s1.split(" ");
		
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=1;j<10;j++)
			{
			if(s[i].charAt(s[i].length()-j)==s[i+1].charAt(s[i+1].length()-j))
			{
				s1=s[i].substring(s[i].length()-j+1,s[i].length());
			}
			else
			{
				
				break; 
			}
			}
		}
		System.out.println(s1);
	}

}

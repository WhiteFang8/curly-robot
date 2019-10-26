package Vs;

public class DupCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="advcfadccaaaaaaafplokplokplokplokplok";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					s=s.substring(0,j)+s.substring(j+1);
					j--;
				}
			}
		}
		System.out.println(s);
		
		
		
		
		
		/*String s1[]=s.split(",");
		int n=0;
		
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			for(int j=i;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
					count++;
			}
			if(n<count){
				n=count;
				s=s1[i];
			}
		}
		System.out.println(s);*/

	}

}

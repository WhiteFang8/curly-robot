package Vs;

public class StarPattern {

	public static void main(String[] args) {
	
		
		for(int i=1;i<=10;i++)
		{	
			char a='A';
			
			for(int j=10;j>i;j--)
			{
				
				System.out.print(" ");
				
				
			}
			for(int k=1;k<=i;k++)

			{
				System.out.print(a+" ");
				a++;
			}
			
			System.out.println(" ");
		}

	}

}

package Vs;

public class UpsideDownTrianglePattern {

	public static void main(String[] args) {
		
		for(int i=10;i>0;i--)
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

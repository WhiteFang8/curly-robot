package Vs;

public class ProductOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=1;
		int s=0;

		for(int i=2;i<15;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0){
					count++;}
			}
			if(count==2)
			{
				s++;
				if(s<=5){
				value=value*i;}
			}
			
		}
		System.out.print(value);
	}

}

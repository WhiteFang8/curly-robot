package Vs;

public class PrimeAndPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc:for(int i=800;i<1000;i++)
		{
			boolean f=false;
			int sum=0;
			int n;
			int temp=i;
			for(int j=2;j<i;j++){
				if(i%j==0)
					f=true;		
			}
				while(temp>0&&!f){
				n=temp%10;
				sum=(sum*10)+n;
				temp=temp/10;
				}
				if(i==sum)
				System.out.println(sum);
					//break abc;
			}
			
		}
	}

	

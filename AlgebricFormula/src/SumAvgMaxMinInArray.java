
public class SumAvgMaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,5,6,2,1};
		int c=a[0];
		int d=a[0];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(c<a[i])
			{
				c=a[i];
			}
			
			if(d>a[i])
			{
				d=a[i];
			}
			sum=sum+a[i];

			
		}
		
		System.out.println("Sum of array: "+sum);
		System.out.println("Avg of array Elements: "+sum/a.length);
		System.out.println("Largest Element in array: "+c);
		System.out.println("smallest Element in array: "+d);

		if(a.length%2==0)
		{
		
		System.out.print("Mid Element in the array is: "+a[a.length/2]);
		System.out.print(" and "+a[a.length/2-1]);
		}
		else
		{
			System.out.print("Mid Element in the array is: " +a[a.length/2]);

		}


			
	

}
}      

package Vs;

public class StringReverseRecurrsion {
	//String s="dsd";
	static void reverse(String s)
	{
		if(s.length()<=1)
		System.out.println(s);
		else
		{
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverseRecurrsion.reverse("raj");
	}
	

}

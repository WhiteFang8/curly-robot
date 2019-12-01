package Vs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		if(a%400==0)
			System.out.println("leap");
		else
			if(a%4==0&&a%100!=0)
				System.out.println("leap year");
			else
				System.out.println("not a leap");
		
	}

}

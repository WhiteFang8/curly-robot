package Vs;

import java.util.Scanner;

public class trickyProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String 1 & 2:");
		String s1=s.next();
		String s2=s.next();
		s.close();
		int count=0;
		if(s1.length()==s2.length()){
		for(int i=0;i<s1.length();i++)
		{
			
			for(int j=0;j<s1.length();j++)
			
			if(s1.charAt(i)==s2.charAt(j))
			{
				count++;
				break;
			}
		}
		if(count==s2.length())
			System.out.println("String Anagram");
		else
			System.out.println("Not String Anagram");
		}
		else{
		System.out.println("Not String Anagram");
		}
	}
	}

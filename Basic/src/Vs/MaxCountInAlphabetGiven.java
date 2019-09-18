package Vs;

import java.util.Scanner;


public class MaxCountInAlphabetGiven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String");
		String s1=s.nextLine();
		s.close();
		char s2[]=s1.toCharArray();
		int count;
		int occurance=0;
		char value=0;
		for(int i=0;i<s2.length;i++)
		{
			count=0;
			if(s2[i]!=' '){
			for(int j=i+1;j<s2.length;j++)

			{
				if(s2[i]==s2[j])
						{
						count++;
						
						}
			}
			if(count>occurance){
			occurance=count+1;
			value=s2[i];
			}
		}}
		System.out.print("The Max occurance of Letter is -"+value+
				"-Which Occured "+occurance+" times in the String");
	}

}

package Vs;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCombination {
	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);
		System.out.println("Give me a String:");
		String s=s2.next();
		s2.close();
		ArrayList<String> a=new ArrayList<>();
		a.add(""+s.charAt(0));
			for(int i=1;i<s.length();i++)
			{
				for(int j=a.size()-1;j>= 0;j--)
				{
					String s1=a.get(j);
					a.remove(j);
					for(int k=0;k<=s1.length();k++)
					{
						a.add(s1.substring(0, k)+s.charAt(i)+s1.substring(k));
					}
				}
			}

			System.out.print(a);
		}

	}



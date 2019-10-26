package Vs;

import java.util.ArrayList;
public class ListPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]={1,2,3,4,5,6 };
		int k=6;
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<b.length;i++)
		{
			a.add(b[i]);
		}
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)+a.get(j)==k)
					System.out.print("["+a.get(i)+","+a.get(j)+"]");
		}


	}
	}
}



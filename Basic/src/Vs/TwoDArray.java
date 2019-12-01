package Vs;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[][]={{1,2,3,4},{4,5,6,5},{7,8,9,8 }};
		int k=0,l=0;
		int row=a.length-1;
		int col=a[0].length-1;
		abc:while(k<=row&&l<=col){
		for(int i=l;i<=col;i++)
		{
			
			System.out.print(a[k][i]);
			
		}
		k++;
		for(int i=k;i<=row;i++)
		{
			System.out.print(a[i][col]);
		}
		col--;
		if(k<=row){
		for(int i=col;i>=l;i--)
		{
			System.out.print(a[row][i]);
		}
		row--;}
		if(l<=col){
		for(int i=row;i>=k;i--)
		{
			System.out.print(a[i][l]);
		}
		l++;
		}
		}
		
		
		
		
		
		
}
}

package Vs;

import java.util.Scanner;
import java.util.TreeSet;

public class LiftShorestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int LiftFloor[]=new int[6];
		int LiftDirection[]=new int[6];
	    for(int i=0;i<LiftFloor.length;i++)
		{
		System.out.println("Lift "+(i+1)+" current floor:");
		LiftFloor[i]=s.nextInt();
		System.out.println("Lift "+(i+1)+" current Direction:");
		LiftDirection[i]=s.nextInt();
		}
		System.out.println("your current floor:");
		int floor=s.nextInt();
		System.out.println("which direction u r heading : 0->down and 1->up:");
		int Direction=s.nextInt();
		int temp=0;
		int no=0;
		boolean flag=true;
		s.close();
		for(int i=0;i<LiftDirection.length;i++)
		{
			if(LiftDirection[i]==1&&Direction==LiftDirection[i]&&LiftFloor[i]<=floor){
				 temp=LiftFloor[i];	
			}
			if(LiftDirection[i]==0&&Direction==LiftDirection[i]&&LiftFloor[i]>=floor){
				 temp=LiftFloor[i];	
					}
			if(floor==LiftFloor[i])
			no=i+1;
	}
		if(Direction==1){
		for(int i=0;i<LiftFloor.length;i++)
		{
			if((LiftFloor[i]<=floor)&&(LiftDirection[i]==Direction)&&(LiftFloor[i]>=temp))
			{
					temp=LiftFloor[i];
					no=i+1;
					flag=false;
		}
			
		}
		}
		else{ 
			if(Direction==0){
			for(int i=0;i<LiftFloor.length;i++)
				{
				if((LiftFloor[i]>=floor)&&(LiftDirection[i]==Direction)&&(LiftFloor[i]<=temp))
				{
					temp=LiftFloor[i];
						no=i+1;
						flag=false;
			    }
		}
			}}
		if(flag)
			System.out.print("wait no lifts nearby");
		else
			System.out.print("nearby lift is "+no+" from "+temp+"th floor");
		}

		
	}
	

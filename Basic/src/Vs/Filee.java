package Vs;

import java.io.File;

public class Filee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ddd";
		File a=new File("d:\\file.txt");
		try{
		 a.createNewFile();
		 System.out.print(a.length());
		 a.canWrite();
}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

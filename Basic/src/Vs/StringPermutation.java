package Vs;

public class StringPermutation {
	 void printPermutn(String str, String ans) 
    { 
          if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            char ch = str.charAt(i); 
  
            String ros = str.substring(0, i)+str.substring(i + 1); 
  
            printPermutn(ros, ans + ch); 
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringPermutation s3=new StringPermutation();
		String s = "abc"; 
        s3.printPermutn(s, "");


	}

}

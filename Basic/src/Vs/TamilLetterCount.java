package Vs;

public class TamilLetterCount {

	public static void main(String[] args) {
		String s="ஃ-சென்னை தி.நகர்,கோ4குரு நிறுவனம் நடத்திய விண்வெளி அறிவியல்";
		char a[]=s.toCharArray();
		char ay = 0;
		StringBuffer u1=new StringBuffer();
		StringBuffer u2=new StringBuffer();
		StringBuffer u3=new StringBuffer();
		StringBuffer rev=new StringBuffer();
		int uyir=0,uyirmei=0,mei=0,Ay=0;
		for(int i=0;i<a.length;i++)
		{
			if(i!=a.length-1){
			   if(a[i+1]>='\u0bbe'&&a[i+1]<='\u0bcd'){
				
					System.out.println(a[i]+""+a[i+1]);
					i++;
					rev=rev.append(a[i]+""+a[i-1]);}
			   else{
					System.out.println(a[i]);
			        rev=rev.append(a[i]);}
			}
			else{
			System.out.println(a[i]);
		    rev=rev.append(a[i]);
			}
			if(a[i]>='\u0b85'&&a[i]<='\u0b94'){
			uyir++;
			u1=u1.append(a[i]);
			}
			if(a[i]=='\u0bcd'){
			mei++;
			u2=u2.append(a[i-1]+""+a[i]);
			}
			if(a[i]>='\u0bbe'&&a[i]<='\u0bcc'){
			uyirmei++;
			u3=u3.append(a[i-1]+""+a[i]);
			}
			if(a[i]=='\u0b83'){
			ay=a[i];
			Ay++;}
		}
System.out.println(rev.reverse());
System.out.println("uyir        :"+uyir+"["+u1+"]");
System.out.println("mei         :"+mei+"["+u2+"]");
System.out.println("uyirmei     :"+uyirmei+"["+u3+"]");
System.out.println("ayuthaEluthu:"+Ay+"["+ay+"]");
}
}

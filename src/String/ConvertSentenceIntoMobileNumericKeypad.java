package String;

import java.util.*;

public class ConvertSentenceIntoMobileNumericKeypad {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		
		String digit[]= {"","2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
		
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
				sb.append(0);
			else
				sb.append(digit[ch-'A'+1]);
		}
		
	String res=sb.toString();
	System.out.println(res);
	
	
	
		
	
	

}
}

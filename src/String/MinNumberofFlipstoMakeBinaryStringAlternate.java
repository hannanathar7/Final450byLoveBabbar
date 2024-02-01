package String;

import java.util.*;

public class MinNumberofFlipstoMakeBinaryStringAlternate {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		int zero=0,one=0;
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(i%2==0 && ch!='0')
				zero++;
			else if(i%2==1 && ch!='1')
				zero++;
			else if(i%2==0 && ch!='1')
				one++;
			else if(i%2==1 && ch!='0')
				one++;
		}
		
		System.out.println(Math.min(zero,one));
	}

}

package String;

import java.util.*;

public class CheckWhether1stringisRotationofAnother {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		sc.close();
		int flag=0;
		String s3=s1+s1;
		if((s1.length()==s2.length()) && (s3.indexOf(s2)!=-1))
		{
			flag=1;
		}
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}

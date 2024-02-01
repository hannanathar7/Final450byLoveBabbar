package String;

import java.util.*;

public class GenerateAllPossibleValidIPfromString {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		ArrayList<String> list=new ArrayList<String>();
		
		
		for(int i=1;i<=3 && i<=l;i++)
		{
			String first=s.substring(0,i);
			if(valid(first))
			{
				for(int j=1;j<=3 && i+j<=l;j++)
				{
					String second=s.substring(i,i+j);
					if(valid(second))
					{
						for(int k=1;k<=3 && i+j+k<=l;k++)
						{
							String third=s.substring(i+j,i+j+k);
							String fourth=s.substring(i+j+k);
							if(valid(third) && valid(fourth))
							{
								String ans=first+"."+second+"."+third+"."+fourth;
								list.add(ans);
							}
						}
					}
				}
			}
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		
	}
	
	public static boolean valid(String s)
	{
		
		if(s.charAt(0)=='0' && s.length()>1)
			return false;
		
		if(s.length()>3)
			return false;
		
		int a=Integer.parseInt(s);
		return (a>=0 && a<=255);
	}
}

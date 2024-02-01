package String;

import java.util.*;

public class DuplicateCharactersInString {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
				map.put(ch,map.get(ch)+1);
			else
				map.put(ch,1);
		}
		
		for(Character ch:map.keySet())
		{
			int v=map.get(ch);
			if(v>1)
				System.out.println(ch);
		}
		
	}
}

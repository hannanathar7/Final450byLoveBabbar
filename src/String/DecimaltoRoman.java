package String;

import java.util.*;

public class DecimaltoRoman {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		String M[]= {"","M","MM","MMM"};
		String C[]= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String X[]= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String I[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		String thousand=M[n/1000];
		n=n%1000;
		String hundred=C[n/100];
		n=n%100;
		String ten=X[n/10];
		n=n%10;
		String one=I[n];
		
		String ans=thousand+hundred+ten+one;
		System.out.println(ans);
		
		
		
	}
	
	
	
	

}

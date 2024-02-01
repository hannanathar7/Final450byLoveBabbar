package LinkedList;


public class Multiply2NoRepresentedbyLL {

	
	
	public static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public static long multiply (Node n1, Node n2)
	{
		long res=0;
		long num1=0,num2=0;
		long m=1000000007;
		Node curr1=n1;
		Node curr2=n2;
		while(curr1!=null)
		{
			num1=(num1*10+curr1.data)%m;
			curr1=curr1.next;
		}
		while(curr2!=null)
		{
			num2=(num2*10+curr2.data)%m;
			curr2=curr2.next;
		}
		res=(num1*num2)%m;
		
		return res;
		
	}
	
	
	
	
	
	
	
	
}

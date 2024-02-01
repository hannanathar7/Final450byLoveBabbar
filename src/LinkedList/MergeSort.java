package LinkedList;



public class MergeSort {

	static Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static Node mergeSort(Node node) {
		if (head == null || head.next == null)
			return head;


		Node mid = middle(head);
		Node secondhead = mid.next;
		mid.next = null;

		Node first = mergeSort(head);
		Node second = mergeSort(secondhead);
		Node newHead = merge(first, second);

		return newHead;

	}

	public static Node merge(Node first, Node second) {

		Node dummy = new Node(-1);
		Node prev = dummy;

		while (first != null && second != null) {
			if (first.data <= second.data) {
				prev.next = first;
				first = first.next;
				prev = prev.next;
			} else {
				prev.next = second;
				second = second.next;
				prev = prev.next;
			}
		}

		while (first != null) {
			prev.next = first;
			first = first.next;
			prev = prev.next;
		}

		while (second != null) {
			prev.next = second;
			second = second.next;
			prev = prev.next;
		}

		return dummy.next;
	}

	public static Node middle(Node node) {
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}

	public static void display(Node node) {
		Node curr = node;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	public static void main(String args[]) {
		head = new Node(9);
		head.next = new Node(5);
		head.next.next = new Node(6);
		head = mergeSort(head);
		display(head);

	}

}

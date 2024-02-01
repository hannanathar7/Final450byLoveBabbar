package BinaryTree;

import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int d) {
		data = d;
		left = null;
		right = null;
	}
}

class Pair {
	Node n;
	int data;

	Pair(Node n1, int v) {
		n = n1;
		data = v;
	}
}

public class AllTraversalsinOneTraversal {

	public static void allTraversals(Node root)

	{

		if (root == null)
			return;

		Stack<Pair> st = new Stack<Pair>();
		st.push(new Pair(root, 1));
		List<Integer> pre = new ArrayList<>();
		List<Integer> in = new ArrayList<>();
		List<Integer> post = new ArrayList<>();

		while (st.size() > 0) {
			
			Pair curr = st.pop();

			if (curr.data == 1) {
				pre.add(curr.n.data);
				curr.data++;
				st.push(curr);

				if (curr.n.left != null)
					st.push(new Pair(curr.n.left, 1));
			}

			else if (curr.data == 2) {
				in.add(curr.n.data);
				curr.data++;
				st.push(curr);

				if (curr.n.right != null)
					st.push(new Pair(curr.n.right, 1));
			}

			else {
				post.add(curr.n.data);
			}
		}

		System.out.println(pre);
		System.out.println(in);
		System.out.println(post);

	}

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		

		allTraversals(root);

	}

}

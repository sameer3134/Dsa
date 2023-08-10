// A recursive java program to print reverse level order traversal
// using stack and queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class BinaryTree
{
    static class Node {
		int data;
		Node left;
		Node right;
	}
	static Node newNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.left = temp.right = null;
		return temp;
	}
	public static void main(String args[])
	{

	Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);

		root.left.left = newNode(4);
		root.left.right = newNode(5);

        Stack<Node> S = new Stack();
		Queue<Node> Q = new LinkedList();
		Q.add(root);
		while (!Q.isEmpty())
		{
			root = Q.peek();
			Q.remove();
			S.push(root);
			if (root.right != null)
				Q.add(root.right);
			if (root.left != null)
				Q.add(root.left);
		}
		while (!S.empty())
		{
			int l = S.peek().data;
			System.out.print(l + " ");
			S.pop();
		}
	}
}

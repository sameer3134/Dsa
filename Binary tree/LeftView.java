// Java Program to print the left view
import java.util.*;
import java.util.LinkedList;

class Left {
	// Binary Tree Node
	static class Node {
		int data;
		Node left, right;

		public Node(int item)
		{
			data = item;
			left = right = null;
		}
	};
	// function to print the left view of binary tree
	public static ArrayList<Integer> leftView(Node root)
	{
		ArrayList<Integer> ans = new ArrayList<>();
        flaa(root,0,ans);

		return ans;
	}
    static void flaa(Node root, int level,ArrayList ans){
        if(root==null){
            return;
        }
        if(ans.size()==level){
            ans.add(root.data);
        }
        flaa(root.left,level+1,ans);
        flaa(root.right,level+1,ans);
    }
	// driver code
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(8);
		root.right.right = new Node(15);
		root.right.left = new Node(12);
		root.right.right.left = new Node(14);

		ArrayList<Integer> vec = leftView(root);
		for (int x : vec) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}

// This code is contributed by Tapesh(tapeshdua420)

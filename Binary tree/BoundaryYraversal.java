// Java program to print boundary traversal of binary tree

import java.io.*;
import java.util.*;

class Boundary {
	Node root;
	/* A binary tree node has data, pointer to left child
and a pointer to right child */
	static class Node {
		int data;
		Node left, right;
		Node(int d)
		{
			data = d;
			left = null;
			right = null;
		}
	}

	private boolean isLeaf(Node root)
	{
		if(root.left==null && root.right==null){
            return true;
        }
        return false;
	}

	private void addLeftBound(Node root,
							ArrayList<Integer> ans)
	{
        Node curr=root.left;
        while(curr!=null){
            if(isLeaf(curr)==false){
                ans.add(curr.data);
            }
            if(curr.left!=null){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
	}

	private void addRightBound(Node root,
							ArrayList<Integer> ans)
	{
        Stack<Integer> st=new Stack<>();
		Node curr=root.right;
        while(curr!=null){
            if(isLeaf(curr)==false){
                st.push(curr.data);
            }
            if(curr.right!=null){
                curr=curr.right;
            }else{
                curr=curr.left;
            }
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
	}

	// its kind of predorder
	private void addLeaves(Node root,
						ArrayList<Integer> ans)
	{
		if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        
        if(root.left!=null){
            addLeaves(root.left, ans);
        }
        if(root.right!=null){
            addLeaves(root.right, ans);
        }
	}

	ArrayList<Integer> boundary(Node root)
	{
		ArrayList<Integer> ans=new ArrayList<>();
        if(!isLeaf(root)){
            ans.add(root.data);
        }
        addLeftBound(root, ans);
        addLeaves(root, ans);
        addRightBound(root, ans);
        return ans;
	}

	public static void main(String[] args)
	{
		// Let us construct the tree given in the above
		// diagram
		Boundary tree = new Boundary();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		tree.root.right = new Node(22);
		tree.root.right.right = new Node(25);

		ArrayList<Integer> ans = tree.boundary(tree.root);

		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		System.out.println();
	}
}

// This code is contributed by Snigdha Patil

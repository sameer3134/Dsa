// Java program check whether BST contains dead end or not
import java.io.*;
import java.util.*;

// A BST node


class deaded {
static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
Node root;

void BST() { root = null; }

// A utility function to insert a new Node with given
// key in BST
Node insert(Node node, int key)
{
	// If the tree is empty, return a new node
	if (node == null) {
	return new Node(key);
	}

	// Otherwise, recur down the tree
	if (key < node.data) {
	node.left = insert(node.left, key);
	}
	else if (key > node.data) {
	node.right = insert(node.right, key);
	}

	// return the (unchanged) Node pointer
	return node;
}

boolean dead(Node root,int l,int r){
    if(root==null){
        return false;
    }
        if(l==r ||l==Integer.MIN_VALUE && r==1){
            return true;
        }
    return dead(root.left, l, root.data-1)||dead(root.right, root.data+1,r);
}

boolean isDeadEnd(Node root)
{
	return dead(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}

public static void main(String[] args)
{
	/*
				8
			/ \
			5 11
			/ \
			2 7
			\
			3
			\
				4	 */
	deaded tree = new deaded();
	Node root = null;
	root = tree.insert(root, 8);
	root = tree.insert(root, 5);
	root = tree.insert(root, 2);
	root = tree.insert(root, 3);
	root = tree.insert(root, 7);
	root = tree.insert(root, 11);
	root = tree.insert(root, 4);

	if (tree.isDeadEnd(root) == true) {
	System.out.println("Yes");
	}
	else {
	System.out.println("No");
	}
}
}

// This code is contributed by lokeshmvs21.

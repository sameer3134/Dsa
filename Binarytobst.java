/* A program to convert Binary Tree to Binary Search Tree */
import java.util.*;

 class bina{
	
	/* A binary tree node structure */
	static class Node {
		int data;
		Node left;
		Node right;
	};

	// index pointer to pointer to the array index
	static int index;


	/* A helper function that stores inorder traversal of a tree rooted
	with node */
	static void storeInorder(Node node, int inorder[])
	{
		if (node == null)
			return;
		storeInorder(node.left, inorder);
		inorder[index] = node.data;
		index++;
		storeInorder(node.right, inorder);
	}
	static int countNodes(Node root)
	{
		if (root == null)
			return 0;
		return countNodes(root.left) + countNodes(root.right) + 1;
	}
	static void arrayToBST(int[] arr, Node root)
	{
		if (root == null)
			return;
		arrayToBST(arr, root.left);
		root.data = arr[index];
		index++;
		arrayToBST(arr, root.right);
	}
	static void binaryTreeToBST(Node root)
	{
		if (root == null)
			return;
		int n = countNodes(root);
		int arr[] = new int[n];
		storeInorder(root, arr);
		Arrays.sort(arr);
		index = 0;
		arrayToBST(arr, root);
	}

	/* Utility function to create a new Binary Tree node */
	static Node newNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	/* Utility function to print inorder traversal of Binary Tree */
	static void printInorder(Node node)
	{
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.data + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Driver function to test above functions */
	public static void main(String args[])
	{
		Node root = null;

		/* Constructing tree given in the above figure
			10
			/ \
			30 15
		/	 \
		20	 5 */
		root = newNode(10);
		root.left = newNode(30);
		root.right = newNode(15);
		root.left.left = newNode(20);
		root.right.right = newNode(5);

		// convert Binary Tree to BST
		binaryTreeToBST(root);

		System.out.println("Following is Inorder Traversal of the converted BST: ");
		printInorder(root);

	}
}

// This code is contributed by adityapande88.

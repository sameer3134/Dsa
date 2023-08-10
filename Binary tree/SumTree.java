// Java program to convert a tree into its sum tree



class Bsum
{
	Node root;
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
	// Convert a given tree to a tree where every node contains sum of
	// values of nodes in left and right subtrees in the original tree
	int toSumTree(Node node)
	{
		if(node==null){
            return 0;
        }
        int old_val= node.data;
        node.data=toSumTree(node.left)+toSumTree(node.right);
        return old_val+node.data;
	}

	// A utility function to print inorder traversal of a Binary Tree
	void printInorder(Node node)
	{
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	/* Driver function to test above functions */
	public static void main(String args[])
	{
		Bsum tree = new Bsum();

		/* Constructing tree given in the above figure */
		tree.root = newNode(10);
		tree.root.left = newNode(-2);
		tree.root.right = newNode(6);
		tree.root.left.left = newNode(8);
		tree.root.left.right = newNode(-4);
		tree.root.right.left = newNode(7);
		tree.root.right.right = newNode(5);

		tree.toSumTree(tree.root);

		// Print inorder traversal of the converted tree to test result
		// of toSumTree()
		System.out.println("Inorder Traversal of the resultant tree is:");
		tree.printInorder(tree.root);
	}
}

// This code has been contributed by Mayank Jaiswal

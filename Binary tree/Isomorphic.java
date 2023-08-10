// An iterative java program to solve tree isomorphism problem

/* A binary tree node has data, pointer to left and right children */


class Isomorphic
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
	Node root1, root2;

	/* Given a binary tree, print its nodes in reverse level order */
	boolean isIsomorphic(Node n1, Node n2)
	{
		if(n1==null || n2==null){
            return n1==n2;
        }
        if(n1.data!=n2.data){
            return false;
        }
        return (isIsomorphic(n1.left, n2.left) && isIsomorphic(n1.right, n2.right) ||
        isIsomorphic(n1.left, n2.right) && isIsomorphic(n1.right,n2.left));
	}

	// Driver program to test above functions
	public static void main(String args[])
	{
		Isomorphic tree = new Isomorphic();
		
		// Let us create trees shown in above diagram
		tree.root1 = newNode(1);
		tree.root1.left = newNode(2);
		tree.root1.right = newNode(3);
		tree.root1.left.left = newNode(4);
		tree.root1.left.right = newNode(5);
		tree.root1.right.left = newNode(6);
		tree.root1.left.right.left = newNode(7);
		tree.root1.left.right.right = newNode(8);

		tree.root2 = newNode(1);
		tree.root2.left = newNode(3);
		tree.root2.right = newNode(2);
		tree.root2.right.left = newNode(4);
		tree.root2.right.right = newNode(5);
		tree.root2.left.right = newNode(6);
		tree.root2.right.right.left = newNode(8);
		tree.root2.right.right.right = newNode(7);

		if (tree.isIsomorphic(tree.root1, tree.root2) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

// This code has been contributed by Mayank Jaiswal

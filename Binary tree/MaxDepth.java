// Java program for above approach
import java.util.LinkedList;
import java.util.Queue;

class Max {

	// A tree node structure
	static class Node {
		int key;
		Node left;
		Node right;
	}

	// Utility function to create
	// a new node
	static Node newNode(int key)
	{
		Node temp = new Node();
		temp.key = key;
		temp.left = temp.right = null;
		return temp;
	}

	/*Function to find the height(depth) of the tree*/
	public static int height(Node root)
	{
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
	}

	// Driver Code
	public static void main(String args[])
	{
		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);

		root.left.left = newNode(4);
		root.left.right = newNode(5);

		System.out.println("Height(Depth) of tree is: "
						+ height(root));
	}
}

// This code is contributed by jana_sayantan.

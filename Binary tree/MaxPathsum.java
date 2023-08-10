// Java program for above approach
import java.util.LinkedList;
import java.util.Queue;

class maxSUm{

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
        int[] dia=new int[1];
        diameter(root,dia);
        return dia[0];
	}
    public static int diameter(Node root, int[] dia){
        if(root==null){
            return 0;
        }
        int lh=diameter(root.left,dia);
        int rh=diameter(root.right, dia);
        dia[0]=Math.max(dia[0],lh+rh+root.key);
        return root.key+Math.max(lh,rh);
    }

	// Driver Code
	public static void main(String args[])
	{
		Node root = newNode(-10);
		root.left = newNode(9);
		root.right = newNode(20);
		root.right.left = newNode(15);
		root.right.right = newNode(7);

		System.out.println("Diameter of tree is: "
						+ height(root));
	}
}

// This code is contributed by jana_sayantan.

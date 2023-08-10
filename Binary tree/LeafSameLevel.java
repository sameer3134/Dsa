// Java program for above approach
import java.util.LinkedList;
import java.util.Queue;

class Level {

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
    public static boolean leaf(Node root){
        if(root==null){
            return true;
        }
        int max_Depth=heightmax(root);
        int min_Depth=heightmin(root);
        if(max_Depth==min_Depth){
            return true;
        }
        return false;
    }
	public static int heightmax(Node root)
	{
        if(root==null){
            return 0;
        }
        int lh=heightmax(root.left);
        int rh=heightmax(root.right);
        return 1+Math.max(lh,rh);
	}
    public static int heightmin(Node root)
	{
        if(root==null){
            return 0;
        }
        int lh=heightmin(root.left);
        int rh=heightmin(root.right);
        return 1+Math.min(lh,rh);
	}
	// Driver Code
	public static void main(String args[])
	{
		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);

		root.left.left = newNode(4);
		root.left.right = newNode(5);

		if(leaf(root)==true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
	}
}

// This code is contributed by jana_sayantan.

// Java program for above approach
import java.util.LinkedList;
import java.util.Queue;

class Balanced {

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
   public static boolean Isbalanced(Node root){
        if(root==null){
            return true;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)<=1 && Isbalanced(root.left) && Isbalanced(root.right)){
            return true;
        }
        return false;
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
        if(Isbalanced(root)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
	}
}

// This code is contributed by jana_sayantan.

// Java program to implement the modified binary search approach
 class Minimum {

	// Node class for BST
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	// Function to find the minimum element in a BST
	static int findMinimum(Node root) {
        if(root==null){
            return -1;
        }
		Node curr=root;
        while(curr.left!=null){
            curr=curr.left;
        }
        return curr.data;
	}

	// Driver code
	public static void main(String[] args) {
		// Create a BST
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		// Find the minimum element in the BST
		int minVal = findMinimum(root);

		// Print the minimum element
		System.out.println("Minimum element in the BST is: " + minVal);
	}
}

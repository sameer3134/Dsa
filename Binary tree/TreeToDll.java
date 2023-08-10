// A Java program for in-place conversion of Binary Tree to DLL

// A binary tree node has data, left pointers and right pointers


class BinaryTreedll
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
	Node root;
	
	// head --> Pointer to head node of created doubly linked list
	Node head;
	
	// Initialize previously visited node as NULL. This is
	// static so that the same value is accessible in all recursive
	// calls
	static Node prev = null;

	// A simple recursive function to convert a given Binary tree
	// to Doubly Linked List
	// root --> Root of Binary Tree
	void BinaryTree2DoubleLinkedList(Node root)
	{
		if(root==null){
            return;
        }
        BinaryTree2DoubleLinkedList(root.left);
        if(prev==null){
            head=root;
        }else{
            prev.right=root;
            root.left=prev;
        }
        prev=root;
        BinaryTree2DoubleLinkedList(root.right);
	}

	/* Function to print nodes in a given doubly linked list */
	void printList(Node node)
	{
		while (node != null)
		{
			System.out.print(node.data + " ");
			node = node.right;
		}
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		// Let us create the tree as shown in above diagram
		BinaryTreedll tree = new BinaryTreedll();
		tree.root = newNode(10);
		tree.root.left = newNode(12);
		tree.root.right = newNode(15);
		tree.root.left.left = newNode(25);
		tree.root.left.right = newNode(30);
		tree.root.right.left = newNode(36);

		// convert to DLL
		tree.BinaryTree2DoubleLinkedList(tree.root);
		
		// Print the converted List
		tree.printList(tree.head);

	}
}
// This code has been contributed by Mayank Jaiswal(mayank_24)

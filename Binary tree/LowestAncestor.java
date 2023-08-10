// Java implementation to find lowest common ancestor of
// n1 and n2 using one traversal of binary tree

/* Class containing left and right child of current
node and key value*/


class Ancestor {
	// Root of the Binary Tree
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

	Node findLCA(int n1, int n2)
	{
		return findLCA(root, n1, n2);
	}

	// This function returns pointer to LCA of two given
	// values n1 and n2. This function assumes that n1 and
	// n2 are present in Binary Tree
	Node findLCA(Node node, int n1, int n2)
	{
		if (node == null ||node.data == n1 || node.data == n2)
			return node;
		Node left_lca = findLCA(node.left, n1, n2);
		Node right_lca = findLCA(node.right, n1, n2);
		if (left_lca != null && right_lca != null)
			return node;
		if(left_lca != null){
			return left_lca;
		}
			return right_lca;
	}

	/* Driver program to test above functions */
	public static void main(String args[])
	{
		Ancestor tree = new Ancestor();
		tree.root = newNode(1);
		tree.root.left = newNode(2);
		tree.root.right = newNode(3);
		tree.root.left.left = newNode(4);
		tree.root.left.right = newNode(5);
		tree.root.right.left = newNode(6);
		tree.root.right.right = newNode(7);
		System.out.println("LCA(4, 5) = "
						+ tree.findLCA(4, 5).data);
		System.out.println("LCA(4, 6) = "
						+ tree.findLCA(4, 6).data);
		System.out.println("LCA(3, 4) = "
						+ tree.findLCA(3, 4).data);
		System.out.println("LCA(2, 4) = "
						+ tree.findLCA(2, 4).data);
	}
}

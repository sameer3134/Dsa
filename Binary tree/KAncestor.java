// Java program to calculate Kth ancestor of given node
 class Solution
{

// A Binary Tree Node
static class Node
{
	int data;
	Node left, right;
};

// temporary node to keep track of Node returned
// from previous recursive call during backtrack
static Node temp = null;
static int k;

// recursive function to calculate Kth ancestor
static Node kthAncestorDFS(Node root, int node )
{
	if(root==null){
        return root;
    }
    if(root.data==node || temp==kthAncestorDFS(root.left, node) || temp==kthAncestorDFS(root.right, node)){
        if(k==0){
            System.out.println(root.data);
            return null;
        }
        k--;
        return root;
    }
    return null;
}

// Utility function to create a new tree node
static Node newNode(int data)
{
	Node temp = new Node();
	temp.data = data;
	temp.left = temp.right = null;
	return temp;
}

// Driver code
public static void main(String args[])
{
	// Let us create binary tree shown in above diagram
	Node root = newNode(1);
	root.left = newNode(2);
	root.right = newNode(3);
	root.left.left = newNode(4);
	root.left.right = newNode(5);

	k = 2;
	int node = 5;

	// print kth ancestor of given node
	Node parent = kthAncestorDFS(root,node);
	
	// check if parent is not null, it means
	// there is no Kth ancestor of the node
	if (parent != null)
		System.out.println("-1");
}
}

// This code is contributed by Arnab Kundu

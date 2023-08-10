// A recursive java program to print reverse level order traversal
// using stack and queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class isvalid
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
	Node root1,root2;
 boolean areIdentical(Node root1, Node root2)
    {
		if(root1 ==null && root2 ==null){
			return root1==root2;
		}
		if(root1.data!=root2.data){
			return false;
		}
		return areIdentical(root1.left, root2.left)&& areIdentical(root1.right, root2.right);
    }
    boolean isSubtree(Node T, Node S)
    {
		if(S==null){
			return true;
		}
        if(T==null){
			return false;
		}

		if(areIdentical(T, S)){
			return true;
		}
		return isSubtree(T.left, S)||isSubtree(T.right, S);
    }
 
    public static void main(String args[])
    {
        isvalid tree = new isvalid();
 
        // TREE 1
        /* Construct the following tree
              26
             /   \
            10     3
           /    \     \
          4      6      3
           \
            30  */
 
        Node root1 = newNode(26);
       root1.right = newNode(3);
        root1.right.right = newNode(3);
        root1.left = newNode(10);
        root1.left.left = newNode(4);
        root1.left.left.right = newNode(30);
        root1.left.right = newNode(6);
 
        // TREE 2
        /* Construct the following tree
           10
         /    \
         4      6
          \
          30  */
 
        Node root2 = newNode(10);
        root2.right = newNode(6);
        root2.left = newNode(4);
        root2.left.right = newNode(30);
 
        if (tree.isSubtree(tree.root1, tree.root2))
            System.out.println(
                "Tree 2 is subtree of Tree 1 ");
        else
            System.out.println(
                "Tree 2 is not a subtree of Tree 1");
    }
}

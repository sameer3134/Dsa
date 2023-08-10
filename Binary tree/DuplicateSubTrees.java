// A java program to find all duplicate subtrees
// in a binary tree.
import java.util.HashMap;
class Duplicate_subtress {

	/* A binary tree node has data, pointer to
	left child and a pointer to right child */
	static HashMap<String, Integer> m;
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	static String inorder(Node node)
	{
		if(node==null){
            return "";
        }
        String s="";
        s += inorder(node.left);
        s+= Integer.toString(node.data);
        s+= inorder(node.right);
        if(m.get(s)!=null && m.get(s)==1){
            System.out.println(node.data);
        }
        if(m.containsKey(s)){
            m.put(s, m.get(s)+1);
        }else{
            m.put(s, 1);
        }
        return s;
	}
	
	// Wrapper over inorder()
	static void printAllDups(Node root)
	{
		m = new HashMap<>();
		inorder(root);
	}
	// Driver code
	public static void main(String args[])
	{
		Node root = null;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(2);
		root.right.left.left = new Node(4);
		root.right.right = new Node(4);
		printAllDups(root);
	}
}
// This code is contributed by Sumit Ghosh

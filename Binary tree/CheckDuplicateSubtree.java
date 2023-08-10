// Java program to find if there is a duplicate
// sub-tree of size 2 or more.
import java.util.HashSet;
class Main {
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
	public static String dupSubUtil(Node root, HashSet<String> subtrees)
	{
		String s = "";
		if (root == null)
			return s + "$";
		String lStr = dupSubUtil(root.left,subtrees);
		if (lStr.equals(s))
			return s;
		String rStr = dupSubUtil(root.right,subtrees);
		if (rStr.equals(s))
			return s;
		s = s + root.data + "%" + lStr+ "%" + rStr;
		if (s.length() > 7 && subtrees.contains(s))
			return "";
		subtrees.add(s);
		return s;
	}
	public static String dupSub(Node root)
	{
		HashSet<String> subtrees=new HashSet<>();
		return dupSubUtil(root,subtrees);
	}

	public static void main(String args[])
	{
		Node root = newNode('A');
		root.left = newNode('B');
		root.right = newNode('C');
		root.left.left = newNode('D');
		root.left.right = newNode('E');
		root.right.right = newNode('B');
		root.right.right.right = newNode('E');
		root.right.right.left= newNode('D');
		String str = dupSub(root);
		if(str.equals(""))
			System.out.print(" Yes ");
		else
			System.out.print(" No ");
	}
}


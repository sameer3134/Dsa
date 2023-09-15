// Java program to find if there is a duplicate
// sub-tree of size 2 or more.
import java.util.HashSet;
class Mains {
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
	static int distance(Node root,int n1,int n2){
        int d1=dist(lca, n1, 0);
        int d2=dist(lca, n2,0);
        return d1+d2;
    }
    static int dist(Node root,int k,int distan){
        if(root==null){
            return -1;
        }
        if(root.data==k){
            return distan;
        }
        int left=dist(root.left, k, distan+1);
        if(left!=-1){
            return left;
        }
        return dist(root.right, k, distan+1);
    }
    static Node findlca(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node left=findlca(root.left, n1,n2);
        Node right=findlca(root.right, n1,n2);
        if(left!=null && right!=null){
            return root;
        }
        if(left==null){
            return right;
        } else{
            return left;
        }

    }

	public static void main(String args[])
	{
		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.left.right = newNode(5);
		root.right.left = newNode(6);
		root.right.right = newNode(7);
		int l=distance(root,4,7);
        System.out.println(l);
	}
}


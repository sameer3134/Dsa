// Java program to implement hash table approach
import java.util.*;

// Node structure

// Main class
class Maina { // Utility function to print the remaining path
			// starting
	// from index i
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
	static void printVector(List<Integer> v, int i)
	{
		for (int j = i; j < v.size(); j++)
			System.out.print(v.get(j) + " ");
		System.out.println();
	}

	// Utility function to print all the k-sum paths
	// starting from a given node
	static void printKPathUtil(Node root, int k, List<Integer> path, HashMap<Integer,Integer> map)
	{
        if(root==null){
            return;
        }
        path.add(root.data);
        printKPathUtil(root.left,k,path,map);
        printKPathUtil(root.right,k,path,map);
        int sum=0;
        for(int i=path.size()-1;i>=0;i--){
            sum+=path.get(i);
            if(sum==k){
                printVector(path, i);
            }
            if(map.containsKey(sum-k)){
                printVector(path, map.get(sum-k));
            }       
        }
        path.remove(path.size() - 1);
	}

	// Utility function to print all the k-sum paths in the
	// binary tree
	static void printKPath(Node root, int k)
	{
		List<Integer> path=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        printKPathUtil(root,k,path,map);
	}

	// Driver code
	public static void main(String[] args)
	{
		int k = 5;
		Node root = newNode(1);
		root.left = newNode(3);
		root.left.left = newNode(2);
		root.left.right = newNode(1);
		root.left.right.left = newNode(1);
		root.right = newNode(-1);
		root.right.left = newNode(4);
		root.right.left.left = newNode(1);
		root.right.left.right = newNode(2);
		root.right.right = newNode(5);
		root.right.right.right = newNode(6);
		printKPath(root, k); // call the utility function to
							// print all the k-sum paths
	}
}

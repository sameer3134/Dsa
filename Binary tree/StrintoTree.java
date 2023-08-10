/* Java program to construct a binary tree from
the given String */
import java.util.*;
class Stringsae
{

/* A binary tree node has data, pointer to left
child and a pointer to right child */
static class Node
{
	int data;
	Node left, right;
};
static Node newNode(int data)
  {
    Node node = new Node();
    node.data = data;
    node.left = node.right = null;
    return (node);
  }
static Node treeFromString(String s)
{
    if(s==null ||s.length()==0){
        return null;
    }
    return str2(s);
}
static int start=0;
static Node str2(String s){
    if(start>=s.length()){
        return null;
    }
    boolean neg=false;
    if(s.charAt(start)=='-'){
        neg=true;
        start++;
    }
    int num=0;
    while(start<s.length() && Character.isDigit(s.charAt(start))){
        int digit=Character.getNumericValue(s.charAt(start));
        num=num*10+digit;
        start++;
    }
    System.out.println(num);
    if(neg==true){
        num=-num;
        neg=false;
    }
    Node root= newNode(num);
    if(start>=s.length()){
        return root;
    }
    if(start<s.length() && s.charAt(start)=='('){
        start++;
        root.left=str2(s);
    }
    if(start<s.length() && s.charAt(start)==')'){
        start++;
        return root;
    }
    if(start<s.length() && s.charAt(start)=='('){
        start++;
        root.right=str2(s);
    }
    if(start<s.length() && s.charAt(start)==')'){
        start++;
        return root;
    }
    return root;
}
static void preOrder(Node node)
  {
    if (node == null)
      return;
    System.out.printf("%d ", node.data);
    preOrder(node.left);
    preOrder(node.right);
  }
// Driver Code
public static void main(String[] args)
{
	String str = "4(2(3)(1))(6(5))";
	Node root = treeFromString(str);
	preOrder(root);
}
}

// This code is contributed by gauravrajput1

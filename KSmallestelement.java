// Java Program for finding K-th largest Node using O(1)
// extra memory and reverse Morris traversal.
class lsmall
{

static class Node
{
	int data;
	Node left, right;
}

// helper function to create a new Node
static Node newNode(int data)
{
	Node temp = new Node();
	temp.data = data;
	temp.right = null;
	temp.left = null;
	return temp;
}
static int ans;
static int KthLargestUsingMorrisTraversal(Node root, int k)
{
	int idx=1;
    ans=-1;
    solve(root,k,idx);
    return ans;
}
static void solve(Node root,int k,int idx){
    if(root==null){
        return;
    }
    solve(root.right, k, idx);
    if(k==idx){
        ans=root.data;  // ulta ho ra k left ki jgh right
        idx++;
        return;
    }else{
        idx++;
    }
    solve(root.left, k, idx);
}

// Driver code
public static void main(String[] args)
{
	// Your Java Code
	/* Constructed binary tree is
		4
		/ \
	2 7
	/ \ / \
	1 3 6 10 */

	Node root = newNode(4);
	root.left = newNode(2);
	root.right = newNode(7);
	root.left.left = newNode(1);
	root.left.right = newNode(3);
	root.right.left = newNode(6);
	root.right.right = newNode(10);

	System.out.println("Finding K-th largest Node in BST : " +
					KthLargestUsingMorrisTraversal(root, 2));

}}

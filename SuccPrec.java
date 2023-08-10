// Java program to find predecessor
// and successor in a BST
class Succprec{

// BST Node
static class Node
{
	int key;
	Node left, right;

	public Node()
	{}

	public Node(int key)
	{
		this.key = key;
		this.left = this.right = null;
	}
};

static Node pre = new Node(), suc = new Node();

// This function finds predecessor and
// successor of key in BST. It sets pre
// and suc as predecessor and successor
// respectively
static void findPreSuc(Node root, int key)
{
	if(root==null){
        return;
    }
    if(root.key==key){
        if(root.left!=null){
        Node temp=root.left;
        while(temp.right!=null){
            temp=temp.right;
        }
        pre=temp;
    }
        if(root.right!=null){
        Node fir=root.right;
        while(fir.left!=null){
            fir=fir.left;
        }
        suc=fir;
    }}
    if(root.key<key){
        pre=root;
        findPreSuc(root.right, key);    
    }else{
        suc=root;
        findPreSuc(root.left, key);       
    }
}

// A utility function to insert a
// new node with given key in BST
static Node insert(Node node, int key)
{
	if (node == null)
		return new Node(key);
	if (key < node.key)
		node.left = insert(node.left, key);
	else
		node.right = insert(node.right, key);
		
	return node;
}

// Driver code
public static void main(String[] args)
{
	
	// Key to be searched in BST
	int key = 65;

	/*
	* Let us create following BST
	*		 50
	*		 / \
	*	 30 70
	*	 / \ / \
	*	 20 40 60 80
	*/

	Node root = new Node();
	root = insert(root, 50);
	insert(root, 30);
	insert(root, 20);
	insert(root, 40);
	insert(root, 70);
	insert(root, 60);
	insert(root, 80);

	findPreSuc(root, key);
	if (pre != null)
		System.out.println("Predecessor is " + pre.key);
	else
		System.out.println("No Predecessor");

	if (suc != null)
		System.out.println("Successor is " + suc.key);
	else
		System.out.println("No Successor");
}
}

// This code is contributed by sanjeev2552

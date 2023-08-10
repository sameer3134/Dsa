// Java program to print top
// view of binary tree
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;



// class of binary tree
class Top {
    static class Node {
		int key;
		Node left;
		Node right;
	}

	// Utility function to create
	// a new node
	static Node newNode(int key)
	{
		Node temp = new Node();
		temp.key = key;
		temp.left = temp.right = null;
		return temp;
	}
	Node root;

	public Top() { root = null; }

	// function should print the topView of
	// the binary tree
	private void TopView(Node root)
	{
		class QueueObj {
			Node node;
			int hd;
			QueueObj(Node node, int hd)
			{
				this.node = node;
				this.hd = hd;
			}
		}
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, Node> map= new TreeMap<Integer, Node>();

		if (root == null) {
			return;
		}else {
			q.add(new QueueObj(root, 0));
		}
		System.out.println(
			"The top view of the tree is : ");
		while (!q.isEmpty()) {
			QueueObj tmp = q.poll();
            int hd=tmp.hd;
            Node h=tmp.node;
			if (!map.containsKey(hd)) {
				map.put(hd,h);
			}
			if (h.left != null) {
				q.add(new QueueObj(h.left,hd - 1));
			}
			if (h.right != null) {
				q.add(new QueueObj(h.right,hd + 1));
			}
		}
		for (Map.Entry<Integer, Node> entry :
			map.entrySet()) {
			System.out.print(entry.getValue().key + " ");
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		/* Create following Binary Tree
		1
	/ \
	2 3
	\
		4
		\
		5
			\
			6
*/
		Top tree = new Top();
		tree.root = newNode(1);
		tree.root.left = newNode(2);
		tree.root.right = newNode(3);
		tree.root.left.right = newNode(4);
		tree.root.left.right.right = newNode(5);
		tree.root.left.right.right.right = newNode(6);
		tree.TopView(tree.root);
	}
}

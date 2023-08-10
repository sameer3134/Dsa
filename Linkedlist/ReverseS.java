// Java program for reversing the linked list

class Reverse {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node head)
	{
		Node prev= null;
		Node curr=head;
        while(curr != null){
            Node temp= curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
	}

	// prints content of double linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		Reverse list = new Reverse();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}

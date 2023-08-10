// Java program to reverse a doubly linked list

class Doubly {

	static Node head;

	static class Node {

		int data;
		Node next, prev;

		Node(int d)
		{
			data = d;
			next = prev = null;
		}
	}

	/* Function to reverse a Doubly Linked List */
	void reverse()
	{
		Node curr = head;
        while(curr.next !=null){
            curr=curr.next;
        }
        head=curr;
        curr.next=curr.prev;
        curr.prev=null;
        curr=curr.next;
        while(curr.prev!=null){
            Node temp=curr.next;
            curr.next=curr.prev;
            curr.prev=temp;
            curr=curr.next;
        }
        curr.prev=curr.next;
        curr.next=null;
	}

	/* UTILITY FUNCTIONS */
	/* Function to insert a node at the beginning of the
	* Doubly Linked List */
	void push(int new_data)
	{
		/* allocate node */
		Node new_node = new Node(new_data);

		/* since we are adding at the beginning,
		prev is always NULL */
		new_node.prev = null;

		/* link the old list of the new node */
		new_node.next = head;

		/* change prev of head node to new node */
		if (head != null) {
			head.prev = new_node;
		}

		/* move the head to point to the new node */
		head = new_node;
	}

	/* Function to print nodes in a given doubly linked list
	This function is same as printList() of singly linked
	list */
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver's code
	public static void main(String[] args)
	{
		Doubly list = new Doubly();

		/* Let us create a sorted linked list to test the
		functions Created linked list will be 10->8->4->2
	*/
		list.push(2);
		list.push(4);
		list.push(8);
		list.push(10);

		System.out.println("Original linked list ");
		list.printList(head);
		
		// Function call
		list.reverse();
	
		System.out.println("");
		System.out.println("The reversed Linked List is ");
		list.printList(head);
	}
}

// This code has been contributed by Mayank Jaiswal

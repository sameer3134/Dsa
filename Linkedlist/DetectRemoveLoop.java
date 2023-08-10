// Java program to detect and remove loop in linked list

class Detect {

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

	// Function that detects loop in the list
	int detectAndRemoveLoop(Node node)
	{
		Node slow = node, fast = node;
		while (slow != null && fast != null
			&& fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				removeLoop(slow, node);
				return 1;
			}
		}
		return 0;
	}
	void removeLoop(Node loop, Node head)
	{
		Node ptr1=loop;
        Node ptr2=loop;
        Node prevNode=ptr1;
        while(ptr1.next!=ptr2){
            prevNode=ptr1;
            ptr1=ptr1.next;
        }
        prevNode.next=null;
	}

	// Function to print the linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		Detect list = new Detect();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		// Creating a loop for testing
		head.next.next.next.next.next = head.next.next;
		list.detectAndRemoveLoop(head);
		System.out.println(
			"Linked List after removing loop : ");
		list.printList(head);
	}
}

// This code has been contributed by Mayank Jaiswal

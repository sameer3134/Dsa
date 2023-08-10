// Java program to delete nodes which have a greater value on
// right side
class ll {
	Node head; // head of list

	/* Linked list Node*/
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Deletes nodes which have a node with greater
	value node on left side */
	void delLesserNodes()
	{
		/* 1.Reverse the linked list */
		reverseList();

		/* 2) In the reversed list, delete nodes which
		have a node with greater value node on left
		side. Note that head node is never deleted
		because it is the leftmost node.*/
		_delLesserNodes();

		/* 3) Reverse the linked list again to retain
		the original order */
		reverseList();
	}

	/* Deletes nodes which have greater value node(s)
	on left side */
	void _delLesserNodes()
	{
		Node curr=head;
        Node max=curr;
        while(curr.next!=null){
            if(max.data<curr.next.data){
                max=curr.next;
                curr=curr.next;
            }else{
                curr.next=curr.next.next;
            }
        }

	}

	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to reverse the linked list */
	void reverseList()
	{
		Node current = head;
		Node prev = null;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	/* Function to print linked list */
	void printList()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/* Driver program to test above functions */
	public static void main(String args[])
	{
		ll llist = new ll();

		/* Constructed Linked List is 12->15->10->11->
		5->6->2->3 */
		llist.push(3);
		llist.push(2);
		llist.push(6);
		llist.push(5);
		llist.push(11);
		llist.push(10);
		llist.push(15);
		llist.push(12);

		System.out.println("Given Linked List");
		llist.printList();

		llist.delLesserNodes();

		System.out.println("Modified Linked List");
		llist.printList();
	}
} /* This code is contributed by Rajat Mishra */

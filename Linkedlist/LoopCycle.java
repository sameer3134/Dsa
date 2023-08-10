// Java program to return first node of loop
import java.util.*;

class LinkedList {

	// Head of list
	static Node head;

	// Linked list Node
	static class Node {
		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	static public void push(int new_data)
	{

		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	// Function to detect first node of loop
	// in a linked list that may contain loop
	static boolean detectLoop(Node head)
	{
		Node slow=head;
        Node fast=head;
        while(slow!=null &&fast!=null){
            
            if(fast==slow){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;		
	}

	// Driver Code
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();

		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(5);

		/* Create a loop for testing */
		llist.head.next.next.next.next.next
			= llist.head.next.next;

		if (detectLoop(llist.head))
			System.out.println("Loop Found");
		else
			System.out.println("Not Found");
	}
}

// This code is contributed by RohitOberoi

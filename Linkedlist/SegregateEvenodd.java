// Java program to segregate even and odd nodes in a
// Linked List
import java.io.*;
import java.util.*;

class ll1 {
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

	void segregateEvenOdd()
	{
		Node evenstart= null,evenend=null;
        Node oddstart=null,oddend=null;
        Node curr=head;
        while(curr!=null){
            int s=curr.data;
            if(s%2==0){
                if(evenstart==null){
                    evenstart=curr;
                    evenend=evenstart;
                }else{
                    evenend.next=curr;
                    evenend=evenend.next;
                }
            }else{
                 if(oddstart==null){
                    oddstart=curr;
                    oddend=oddstart;
                }else{
                    oddend.next=curr;
                    oddend=oddend.next;
                }
            }
            curr=curr.next;
        }
        if(oddstart==null||evenstart==null){
            return;
        }
        evenend.next=oddstart;
        oddend.next=null;
        head=evenstart;
	}

	/* Given a reference (pointer to pointer) to the head
		of a list and an int, push a new node on the front
		of the list. */
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

	// Utility function to print a linked list
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
		ll1 llist = new ll1();
		llist.push(11);
		llist.push(10);
		llist.push(5);
		llist.push(6);
		llist.push(4);
		llist.push(2);
		llist.push(3);
		System.out.println("Original Linked List");
		llist.printList();

		llist.segregateEvenOdd();

		System.out.println("Modified Linked List");
		llist.printList();
	}
} /* This code is contributed by Rajat Mishra */

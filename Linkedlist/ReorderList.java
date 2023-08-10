// Java program to remove duplicates
// from unsorted linkedlist

import java.util.HashMap;
import java.util.HashSet;

 class Reorder {
	static class node {
		int val;
		node next;

		public node(int val) { this.val = val; }
	}

	/* Function to remove duplicates from a
	unsorted linked list */
	static void Reordering(node head)
	{
		node slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node node1=head;
        node node2=slow.next;
        slow.next=null;
        node2= reverse(node2);
        node m= new node(0);
        node s=m;
        while(node1!=null || node2!=null){
           if(node1 !=null){
                s.next=node1;
                s=s.next;
                node1=node1.next;
           }
           if(node2 !=null){
                s.next=node2;
                s=s.next;
                node2=node2.next;
           }
        }
	}
     static node reverse(node head){
        node prev=null,curr=head;
        while(curr!=null){
            node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
     }
	/* Function to print nodes in a given linked list */
	static void printList(node head)
	{
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args)
	{
		/* The constructed linked list is:
		10->12->11->11->12->11->10*/
		node start = new node(1);
		start.next = new node(2);
		start.next.next = new node(3);
		start.next.next.next = new node(4);
		start.next.next.next.next = new node(5);
		start.next.next.next.next.next = new node(6);
		start.next.next.next.next.next.next = new node(7);

		System.out.println(
			"Linked list before removing duplicates :");
		printList(start);

		Reordering(start);

		System.out.println(
			"\nLinked list after removing duplicates :");
		printList(start);
	}
}

// This code is contributed by Rishabh Mahrsee

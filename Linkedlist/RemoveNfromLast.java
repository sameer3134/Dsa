// Java program to remove duplicates
// from unsorted linkedlist

import java.util.HashMap;
import java.util.HashSet;

 class Remove {
	static class node {
		int val;
		node next;

		public node(int val) { this.val = val; }
	}

	/* Function to remove duplicates from a
	unsorted linked list */
	static void Removing(node head,int n)
	{		
        node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        node temp=null,curr1=head;
        for(int i=0;i<count-n;i++){
            temp=curr1;
            curr1=curr1.next;
        }
        if(curr1!=null){
            temp.next=curr1.next;
        }
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

		Removing(start,2);

		System.out.println(
			"\nLinked list after removing duplicates :");
		printList(start);
	}
}

// This code is contributed by Rishabh Mahrsee

// Java program to remove duplicates
// from unsorted linkedlist

import java.util.HashMap;
import java.util.HashSet;

 class sort {
	static class node {
		int val;
		node next;

		public node(int val) { this.val = val; }
	}

	/* Function to remove duplicates from a
	unsorted linked list */
	static void sorting(node head)
	{
		int[] a=new int[3];
        node curr=head;
        while(curr!=null){
            a[curr.val]++;
            curr=curr.next;
        }
        int i=0;
        node ptr=head;
        while(ptr!=null){
            if(a[i]==0){
                i++;
            }else{
                ptr.val=i;
                a[i]--;
                ptr=ptr.next;
            }
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
		start.next = new node(1);
		start.next.next = new node(2);
		start.next.next.next = new node(0);
		start.next.next.next.next = new node(0);
		start.next.next.next.next.next = new node(1);
		start.next.next.next.next.next.next = new node(0);

		System.out.println(
			"Linked list before removing duplicates :");
		printList(start);

		sorting(start);

		System.out.println(
			"\nLinked list after removing duplicates :");
		printList(start);
	}
}

// This code is contributed by Rishabh Mahrsee

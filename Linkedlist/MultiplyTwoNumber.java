// Java program to Multiply two numbers
// represented as linked lists
import java.util.*;

class Multiply{

	// Linked list node
	static class Node
	{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	// Multiply contents of two linked lists
	static long multiplyTwoLists(Node first, Node second)
	{
		Node curr1=first,curr2=second;
        int a=0,b=0;
        while(curr1!=null){
           a= (a*10)+curr1.data;
           curr1=curr1.next;
        }
         while(curr2!=null){
           b= (b*10)+curr2.data;
           curr2=curr2.next;
        }
        return (a*b);
	}

	// A utility function to print a linked list
	static void printList(Node node)
	{
		while(node != null)
		{
			System.out.print(node.data);
			if(node.next != null)
				System.out.print("->");
			node = node.next;
		}
		System.out.println();
	}

	// Driver program to test above function
	public static void main(String args[])
	{
		// create first list 9->4->6
		Node first = new Node(9);
		first.next = new Node(4);
		first.next.next = new Node(6);
		System.out.print("First List is: ");
		printList(first);

		// create second list 8->4
		Node second = new Node(8);
		second.next = new Node(4);
		System.out.print("Second List is: ");
		printList(second);

		// Multiply the two lists and see result
		System.out.print("Result is: ");
		System.out.println(multiplyTwoLists(first, second));
	}
}

// This code is contributed by adityapande88

// package whatever //do not write package name here
import java.io.*;
import java.util.HashSet;

// Java Program to get intersection point of two linked list
 class lk{
	static class Node{
		int data;
		Node next;
		boolean visited;
		Node(int d){
			data = d;
			next = null;
			visited = false;
		}
	}
	
	static int getIntersectNode(Node head1, Node head2){
		HashSet<Node> hs= new HashSet<>();
        Node curr1=head1;
        Node curr2=head2;
        while(curr1!=null){
            hs.add(curr1);
            curr1=curr1.next;
        }
        while(curr2!=null){
            if(hs.contains(curr2)){
                return curr2.data;
            }
            curr2=curr2.next;
        }
        return -1;
	}
	
	public static void main(String[] args){
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		head1.next.next.next.next.next = new Node(6);
		head1.next.next.next.next.next.next = new Node(7);
		// list 2
		Node head2 = new Node(10);
		head2.next = new Node(9);
		head2.next.next = new Node(8);
		head2.next.next.next = head1.next.next.next;
		
		System.out.print("The node of intersection is : " + getIntersectNode(head1, head2));
	}
}

// Java program to illustrate merge sorted
// of linkedList
 class ll3 {
	node head = null;
	// node a, b;
	static class node {
		int val;
		node next;

		public node(int val)
		{
			this.val = val;
		}
	}

	node sortedMerge(node a, node b)
	{
		node answer =null;
		if(a==null){
			return b;
		}
		if(b==null){
			return a;
		}
			if(a.val<=b.val){
                answer=a;
				answer.next= sortedMerge(a.next, b);
			}else{
				answer=b;
				answer.next=sortedMerge(a, b.next);
			}
		
		return answer;
	}

	node mergeSort(node h)
	{
		 if (h == null || h.next == null) {
            return h;
        }
        node middle = getMiddle(h);
        node nextofmiddle = middle.next;
        middle.next = null;
        node left = mergeSort(h);
        node right = mergeSort(nextofmiddle);
        node sortedlist = sortedMerge(left, right);
        return sortedlist;
	}

	// Utility function to get the middle of the linked list
	public static node getMiddle(node head)
	{
		if(head==null){
			return head;
		}
		node slow=head;
		node fast=head;
		while(fast.next!=null&&fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	void push(int new_data)
	{
		/* allocate node */
		node new_node = new node(new_data);

		/* link the old list of the new node */
		new_node.next = head;

		/* move the head to point to the new node */
		head = new_node;
	}

	// Utility function to print the linked list
	void printList(node headref)
	{
		while (headref != null) {
			System.out.print(headref.val + " ");
			headref = headref.next;
		}
	}

	public static void main(String[] args)
	{

		ll3 li = new ll3();
		/*
		* Let us create a unsorted linked list to test the functions
		* created. The list shall be a: 2->3->20->5->10->15
		*/
		li.push(15);
		li.push(10);
		li.push(5);
		li.push(20);
		li.push(3);
		li.push(2);

		// Apply merge Sort
		li.head = li.mergeSort(li.head);
		System.out.print("\n Sorted Linked List is: \n");
		li.printList(li.head);
	}
}

// This code is contributed by Rishabh Mahrsee

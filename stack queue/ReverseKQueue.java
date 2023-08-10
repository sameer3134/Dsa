import java.io.*;
import java.util.*;
import java.util.LinkedList;
class GF {
// Function to reverse first k elements of a queue.
static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
    Stack<Integer> st= new Stack<Integer>();
    int s=k;
	while(k!=0 && !q.isEmpty()){
        st.push(q.peek());
        q.remove();
        k--;
    }
    while(!st.isEmpty()){
        q.add(st.peek());
        st.pop();
    }
    for(int i=0;i<q.size()-s;i++){
        q.add(q.peek());
        q.remove();
    }
    return q;
}


// driver code
public static void main (String[] args) {
	Queue<Integer> queue = new LinkedList<Integer>();
	queue.add(10);
	queue.add(20);
	queue.add(30);
	queue.add(40);
	queue.add(50);
	queue.add(60);
	queue.add(70);
	queue.add(80);
	queue.add(90);
	queue.add(100);

	int k = 5;
	queue = reverseFirstK(queue, k);
	// printing queue
	while (!queue.isEmpty()) {
		System.out.print(queue.poll() + " ");
	}
}
}

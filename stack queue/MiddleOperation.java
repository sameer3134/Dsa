/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class MyStack {
	Stack<Integer> s=new Stack<Integer>();;
	Deque<Integer> dq= new ArrayDeque<Integer>();;

	MyStack()
	{
	}
	void add(int data)
	{
		dq.addLast(data);
        if(dq.size()>s.size()+1){
            int temp=dq.pollFirst();
            s.push(temp);
        }
	}
	void pop()
	{
		dq.pollLast();
        if(dq.size()<s.size()){
            int temp=s.pop();
            dq.addFirst(temp);
        }
	}
	int getMiddleElement() { 
        return dq.getFirst();
     }
	void deleteMiddleElement()
	{
		dq.pollFirst();
        if(dq.size()<s.size()){
            int temp=s.pop();
            dq.addFirst(temp);
        }
	}
}
class GG {
	public static void main(String[] args)
	{
		MyStack s = new MyStack();
		s.add(2);
		s.add(5);

		System.out.println("Middle element:"
						+ s.getMiddleElement());
		s.add(3);
		s.add(7);
		s.add(4);
		System.out.println("Middle element:"
						+ s.getMiddleElement());
		s.deleteMiddleElement();
		System.out.println("Middle element:"
						+ s.getMiddleElement());
		s.deleteMiddleElement();
		System.out.println("Middle element:"
						+ s.getMiddleElement());
		s.pop();
		s.pop();
		s.deleteMiddleElement();
	}
}

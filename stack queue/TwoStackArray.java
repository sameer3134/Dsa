// Java program to implement two stacks in a
// single array

import java.io.*;

class TwoStacks {
	int size;
	int top1, top2;
	int arr[];

	// Constructor
	TwoStacks(int n)
	{
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}

	// Method to push an element x to stack1
	void push1(int x)
	{
        if(top1<top2-1){
            top1++;
            arr[top1]=x;       
        }else{
            System.out.println("overflow");
        }
	}
	void push2(int x)
	{
		if(top1<top2-1){
            top2--;
            arr[top2]=x;
        }else{
            System.out.println("overflow");
        }
	}
	int pop1()
	{
		if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;
        }else{
            System.out.println("unerflow");
            return 0;
        } 
	}
	int pop2()
	{
		if(top2<size){
            int x=arr[top2];
            top2++;
            return x;
        }else{
            System.out.println("underflow");
            return 0;
    }
	}

	// Driver program to test twoStack class
	public static void main(String args[])
	{
		TwoStacks ts = new TwoStacks(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		System.out.println("Popped element from"
						+ " stack1 is " + ts.pop1());
		ts.push2(40);
		System.out.println("Popped element from"
						+ " stack2 is " + ts.pop2());
	}
}
// This code has been contributed by
// Amit Khandelwal(Amit Khandelwal 1).

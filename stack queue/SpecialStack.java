import java.util.Stack;

class SpecialStack extends Stack<Integer> {
	Stack<Integer> min = new Stack<>();

	/* SpecialStack's member method to
insert an element to it. This method
	makes sure that the min stack is
also updated with appropriate minimum
	values */
	void push(int x)
	{
		if(isEmpty()){
            super.push(x);
            min.push(x);
        }else{
        int y=min.pop();
        min.push(y);
        super.push(x);
        if(x<=y){
            min.push(x);
            
        }
    }
	}
	public Integer pop()
	{
		int y=min.pop();
        
        int x=super.pop();
        if(x!=y){
            min.push(y);
        }
        return x;
	}
	int getMin()
	{
		int x = min.pop();
		min.push(x);
		return x;
	}

	/* Driver program to test SpecialStack
methods */
	public static void main(String[] args)
	{
		SpecialStack s = new SpecialStack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.getMin());
		s.push(5);
		System.out.println(s.getMin());
	}
}
// This code is contributed by Sumit Ghosh
